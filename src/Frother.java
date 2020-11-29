public class Frother extends MachineComponent{

    private Mediator mediator;
    private Milk milk;

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String froth() {

        return "Frothing "+ milk +"....completed \n" + mediator.stopFroth();
    }
}
