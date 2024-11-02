class Banca{
    private ContBancar conturi[];
    private int numarConturi;

    public Banca(){
        this.conturi = new ContBancar[100];
        this.numarConturi = 0;
    }

    public boolean adaugaCont(ContBancar contAdaugat){
        if(numarConturi < 100){
            for(int i = 0; i < numarConturi; i++){
                if(conturi[i].equals(contAdaugat)){
                    return false;
                }

                conturi[numarConturi ++] = contAdaugat;

                return true;
            }
        }

        return false;
    }

    public String toString(){
        String rezultat = "Conturile din banca : \n";

        for(int i = 0; i < numarConturi; i++){
            rezultat +=
        }
    }
}