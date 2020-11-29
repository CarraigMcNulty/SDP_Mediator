public class Grinder extends MachineComponent{

    private Mediator mediator;
    private Bean bean;

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }


    public String grind() {



     return "Grinding " + bean + "....completed \n" + mediator.stopGrinding() ;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


}