public class Boiler extends MachineComponent {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String boil(){

        return "boiling water....completed\n" + mediator.stopBoil();
    }
}


