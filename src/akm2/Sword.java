package akm2;

public class Sword extends Weapon{

    public Sword() {
        super("Close Range", "Sword");
    }

    @Override
    protected boolean assignTo(String ownedBy) {
        if (ownedBy.equalsIgnoreCase("Warrior")) {
            System.out.println("The Sword has been assigned to the Warrior.");
            return true;
        }
        return false;
    }

    @Override
    protected boolean upgrade(int level) {
        if (level > 0 && level < 15){
            System.out.println("The Sword has been upgraded to level "+level);
            return true;
        }
        return false;
    }
}
