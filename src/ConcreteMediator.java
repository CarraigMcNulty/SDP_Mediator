public class ConcreteMediator implements Mediator{
    private Frother frother;
    private Boiler boiler;
    private Grinder grinder;

    public Frother getFrother() {
        return frother;
    }

    public void setFrother(Frother frother) {
        this.frother = frother;
    }

    public Boiler getBoiler() {
        return boiler;
    }

    public void setBoiler(Boiler boiler) {
        this.boiler = boiler;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    @Override
    public String stopGrinding() {
       return boiler.boil();
    }

    @Override
    public String stopBoil() {
        return frother.froth();
    }

    @Override
    public String stopFroth() {
        return "\nCoffee Complete " + frother.getMilk() + " " + grinder.getBean();
    }
}
