abstract class Task{
    String nume;

    public Task(String nume){
        this.nume = nume;
    }

    public abstract boolean execute(double secundeExecutieTask); //true -> task terminat
}

class SimpleTask extends Task{


}