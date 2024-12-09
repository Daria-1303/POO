class Student{
    private int nrMatricol;
    private String nume;
    private int anInmatriculare;

    //...

    public Student(int nrMatricol, String nume, int anInmatriculare){
        this.nrMatricol = nrMatricol;
        this.nume = nume;
        this.anInmatriculare = anInmatriculare;
    }

    public int getNrMatricol(){
        return nrMatricol;
    }

    public String getNume(){
        return nume;
    }

    public int getAnInmatriculare(){
        return anInmatriculare;
    }
}

class Client{
    public static void main(String [] args){
        ArrayList studenti = new ArrayList(32);
        studenti.add(new Student(192, "Mario", 2020));
        studenti.add(new Student(193, "Daniel", 2024));
    }
}