class Curs{
    Student[] studenti;
    int numarStudenti;

    public Curs(int numarStudenti) {
        this.numarStudenti = numarStudenti;
        this.studenti = new Student[100];
    }

    public boolean adaugaStudent(Student studentAdaugat){
        if(numarStudent < 100){
            for(int i = 0; i < numarStudenti; i++){
                if(studenti[i].equals(studentAdaugat)){
                    return false;
                }
            }

            studenti[numarStudenti++] = studentAdaugat;

            return true;
        }

        return false;
    }


    public String toString(){
        String rezultat = "Studentii de la curs sunt : \n";

        for(int i = 0; i < numarStudenti; i++){
            rezultat += studenti[i].toString() + "\n";
        }

        return rezultat;
    }

    


}