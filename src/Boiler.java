public class Boiler {

    public Boiler(){

    }

public void boil(){
    System.out.println("boiling water....completed");

    Frother frother = new Frother();
    frother.froth();
    }
}
