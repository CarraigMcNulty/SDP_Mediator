public class MakeCoffee {
    public static void main(String[] args) {

        Grinder grinder = new Grinder();
        Boiler boiler = new Boiler();
        Frother frother = new Frother();
        ConcreteMediator mediator = new ConcreteMediator();

        grinder.setMediator(mediator);
        boiler.setMediator(mediator);
        frother.setMediator(mediator);

        mediator.setGrinder(grinder);
        mediator.setBoiler(boiler);
        mediator.setFrother(frother);

        frother.setMilk(Milk.SKIMMILK);
        grinder.setBean(Bean.DARKROAST);

        System.out.println(grinder.grind());
    }
}

