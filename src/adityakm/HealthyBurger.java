package adityakm;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price, String breadRollType) {
        super("Healthy Burger", meat, price, breadRollType);
    }

    public void addHealthyAddition1(String additionName1, double additionPrice1) {
        super.addHamburgerAddition1(additionName1, additionPrice1);
    }

    public void addHealthyAddition2(String additionName1, double additionPrice1, String additionName2, double additionPrice2) {
        super.addHamburgerAddition2(additionName1, additionPrice1, additionName2, additionPrice2);
    }
}
