package adityakm;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String meat, double price, String breadRollType){
        super("Deluxe Burger", meat, price, breadRollType);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String addition1Name, double addition1Price, String addition2Name, double addition2Price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price) {
        System.out.println("Cannot add additional items to a Deluxe Burger");
    }

    @Override
    public double itemizehamburger() {
        super.addHamburgerAddition2("Chips", 2.75, "Drink", 1.81);
        return super.itemizehamburger();
    }
}
