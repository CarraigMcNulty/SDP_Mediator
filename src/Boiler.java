public class Boiler {

    public Boiler(){

    }

public void boil(String milkType){
    System.out.println("boiling water....completed");

    Frother frother = new Frother();
    frother.froth(milkType);
    }
}
