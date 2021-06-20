package adityakm;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;

    //Fields for add-ons
    private String addition1Name = "", addition2Name = "", addition3Name = "", addition4Name = "";
    private double addition1Price = 0.0, addition2Price = 0.0, addition3Price = 0.0, addition4Price = 0.0;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, String addition2Name, String addition3Name, String addition4Name, double addition1Price, double addition2Price, double addition3Price, double addition4Price) {
        this(name, meat, price, breadRollType); //Calling the constructor of this class from another constructor (this() call)
        this.addition1Name = addition1Name;
        this.addition2Name = addition2Name;
        this.addition3Name = addition3Name;
        this.addition4Name = addition4Name;
        this.addition1Price = addition1Price;
        this.addition2Price = addition2Price;
        this.addition3Price = addition3Price;
        this.addition4Price = addition4Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, double addition1Price) {
        this(name, meat, price, breadRollType); //Calling the constructor of this class from another constructor (this() call)
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, String addition2Name, double addition1Price, double addition2Price) {
        this(name, meat, price, breadRollType); //Calling the constructor of this class from another constructor (this() call)
        this.addition1Name = addition1Name;
        this.addition2Name = addition2Name;
        this.addition1Price = addition1Price;
        this.addition2Price = addition2Price;
    }

    public Hamburger(String name, String meat, String breadRollType, double price, String addition1Name, String addition2Name, String addition3Name, double addition1Price, double addition2Price, double addition3Price) {
        this(name, meat, price, breadRollType); //Calling the constructor of this class from another constructor (this() call)
        this.addition1Name = addition1Name;
        this.addition2Name = addition2Name;
        this.addition3Name = addition3Name;
        this.addition1Price = addition1Price;
        this.addition2Price = addition2Price;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition1Name, double addition1Price, String addition2Name, double addition2Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double itemizehamburger(){
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }
}
