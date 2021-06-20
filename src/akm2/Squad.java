package akm2;

public abstract class Squad {
    private String type;
    private int strength;
    private String name;

    public Squad(String type, int strength, String name) {
        this.type = type;
        this.strength = strength;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    public abstract void march(int distance);
    public abstract int attack(int duration);
    public abstract void retreat();
}
