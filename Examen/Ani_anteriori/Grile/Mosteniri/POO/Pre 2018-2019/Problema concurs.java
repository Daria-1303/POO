import java.util.*;

class Problema {
    private double dificultate;

    public Problema() { // nu aveai nevoie de parametru la constructor
        dificultate = Math.random(); // nu are rost sa apelezi metoda setDificultate..
    }

    public double getDificultate() {
        return dificultate;
    }
    // functie inutila
}

abstract class Concurent {
    protected int nrPbRezolvate; // toate variabilele globale se declara automat pe 0...
    protected int timpTotal; // deci atribuirea valorii 0 e inutila si consuma timp si memorie
    protected double gradPregatire;

    public Concurent() { // aceeasi poveste ca mai sus
        gradPregatire = Math.random();
    }

    public int getNrP() {
        return nrPbRezolvate;
    }

    public int getTimp() {
        return timpTotal;
    }

    abstract public void rezolvaProblema(Problema p);

}

class Incepator extends Concurent {
    /*
     * public Incepator(double gradPregatire) { // asta e pus automat de executor,
     * il pui doar in cazul in care trebuie sa ii dai parametrii //super(); } so e
     * useless sa pui un constructor aici
     */
    public void rezolvaProblema(Problema p) {
        if (gradPregatire >= p.getDificultate()) // nu iti trebuie metoda de obtinere a gradului de pregatire, e
                                                 // atribuit
                                                 // protected
            nrPbRezolvate++;
        if (p.getDificultate() > 0.5) {
            timpTotal += (1 - gradPregatire) * 2000;
        } else
            timpTotal += (1 - gradPregatire) * 1000;
    }
}

class Experimentat extends Incepator {
    private ArrayList<Concurs> concursuri = new ArrayList<Concurs>();

    /*
     * same story public Experimentat(double gradPregatire) { //same story //
     * super(gradPregatire); }
     */
    public void rezolvaProblema(Problema pb) {
        boolean ok = false;
        for (Concurs item : concursuri)
            if (item.verifPb(pb))
                ok = true;
        if (ok) {
            timpTotal = 0;
        } else {
            super.rezolvaProblema(pb);
        }
    }
}

abstract class Concurs {
    protected ArrayList<Concurent> concurenti = new ArrayList<Concurent>();
    protected ArrayList<Problema> probleme = new ArrayList<Problema>();
    protected int nrProblemeDate;

    public Concurs(ArrayList<Concurent> c, int p, ArrayList<Problema> pr) {
        probleme = pr;
        nrProblemeDate = p;
        concurenti = c;
    }

    public boolean verifPb(Problema pb) {
        return probleme.contains(pb);
    }

    public Concurent getCastigator() {
        int nrP = 0;
        Concurent c = null;
        for (Concurent item : concurenti)
            if (item.getNrP() > nrP) {
                nrP = item.getNrP();
                c = item;
            } else if (item.getNrP() == nrP) {
                if (item.getTimp() < c.getTimp())
                    c = item;
            }
        return c;
    }

    abstract public void start();
}

class Simplu extends Concurs {
    public Simplu(ArrayList<Concurent> c, int p, ArrayList<Problema> pr) {
        super(c, p, pr);
    }

    public void start() {
        for (Concurent item : concurenti)
            for (Problema item2 : probleme)
                item.rezolvaProblema(item2);
    }
}

class Regional extends Simplu {
    private ArrayList<Concurs> subConcursuri = new ArrayList<Concurs>();

    public Regional(ArrayList<Concurent> c1, int p, ArrayList<Problema> pr, ArrayList<Concurs> c) {
        super(c1, p, pr);
        subConcursuri = c;
    }

    public void start() {
        for (Concurs item : subConcursuri)
            item.start();
        super.start();
    }

    public void Castigatori() {
        ArrayList<Concurent> castigatori = new ArrayList<Concurent>();
        for (Concurs item : subConcursuri)
            castigatori.add(item.getCastigator());
    }

}