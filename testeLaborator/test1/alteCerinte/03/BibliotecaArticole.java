class BibliotecaArticole{
    private Articol [] articole;
    private int numarArticole;

    //constructor
    public BibliotecaArticole(){
        this.articole = new Articol[100];
        this.numarArticole = 0;
    }

    public boolean adaugaArticol(Articol articolAdaugat){
        if(numarArticole < 100){
            for(int i = 0; i < numarArticole; i++){
                if(articole[i].equals(articolAdaugat)){
                    return false;
                }
            }

            articole[numarArticole ++] = articolAdaugat;

            return true;
        }

        return false;
    }

    public String afiseazaArticole(){
        String rezultat = "";

        for(int i = 0; i < numarArticole; i++){
            rezultat += articole[i].toString() + "\n"; 
        }

        return rezultat;
    }
}