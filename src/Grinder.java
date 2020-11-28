public class Grinder {

    public void grind(String beanType,String milkType) {
     System.out.println("Grinding" + beanType + "....completed");
     Boiler boiler = new Boiler();
     boiler.boil(milkType);
    }
}
