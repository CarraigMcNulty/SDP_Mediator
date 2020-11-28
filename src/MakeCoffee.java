public class MakeCoffee {
    public static void main(String[] args) {

        final String beans = "Medium Roast";
        final String milk = "Whole Milk";

        Grinder grinder = new Grinder();

        grinder.grind(beans,milk);
    }
}
