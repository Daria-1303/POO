class Telefon{
    private String numeProprietar;
    private String [] apelanti = new String[100];
    private int contorApeluri;


    public Telefon(String numeProprietar){
        this.numeProprietar = numeProprietar;
        this.contorApeluri = 0;
    }

    public boolean apeleaza(Telefon apelator){
        if(this.contorApeluri < 100){
            apelanti[contorApeluri++] = apelator.numeProprietar;
            return true;
        }

        return false;
    }

    public Integer numarDeApeluri(String numeProprietarTelefon){
        Integer nrApeluri = 0;

        for(int i = 0; i < contorApeluri; i++){
            if(apelanti[i].equals(numeProprietarTelefon)){
                nrApeluri++;
            }
        }

        return nrApeluri;
    }

    public String toString(){
        String output = "Nume proprietar : " + numeProprietar + "\n Apelanti : ";

        for(int i = 0; i < this.contorApeluri; i++){
            output += apelanti[i] + " ";
        }

        return output;
    }

}
