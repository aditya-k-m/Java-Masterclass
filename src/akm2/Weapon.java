package akm2;

public abstract class Weapon {
    private String type;
    private String name;

    public Weapon(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    protected abstract boolean assignTo(String ownedBy);
    protected abstract boolean upgrade(int level);

    public boolean attack(int hits){
        if(hits > 0 && hits < 20){
            System.out.println("The enemy has been given "+hits+" hits.");
            return true;
        }
        return false;
    }
}
