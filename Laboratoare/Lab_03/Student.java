class Student{
    private String nume;
    private int varsta;
    private int inaltime;
    private double note[];

    public String getNume(){
        return nume;
    }

    //metode...
    public void saluta(Student s){
        System.out.println("Salut, "  + s.getNume() + "!");
    }

    public void saluta(Profesor p){
        System.out.println("Buna ziua, " + p.getNume() + "!");
    }

    // //doua functii supraincarcate trb sa aiba acelasi return type, deoarece compilatorul java se uita la semnatura functiei
    // supraincarcarea tine cont de ordinea parametrilor, dar sa aiba tipuri diferite

    public Student(){
        System.out.println("Studentul a fost creat!");
    }

    public Student(String nume, int varsta, int inaltime){
        this();
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

    public Student(String nume, int varsta, int inaltime, double note[]){
        //pot lipsi
        // this.nume = nume;
        // this.varsta = varsta;
        // this.inaltime = inaltime;

        //asta e apelul la constructorul de sus
        this(nume, varsta, inaltime);
        this.note =note;
    }
}
