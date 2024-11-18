abstract class Car {
    // in main new Masina() nu va compila - > este doar pentru a imparti functionalitatea pe celelalte clase
    //clasele abstracte nu pot fi instantate
    public void porneste(){

    }

    public void opreste(){
        
    }

    public void alimenteaza(){
        System.out.println("Se alimenteaza...");
    }
}

class MasinaDiesel extends Car{
    public void alimenteaza(){
        System.out.println("Se alimenteaza cu Diesel");
    }
}

class MasinaElectrica extends Car{
    public void alimenteaza(){
        System.out.println("Se incarca...");
    }
}
