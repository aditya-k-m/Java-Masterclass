package akm2;

public class Archer implements IMove{
    private String name;

    public Archer(String name) {
        this.name = name;
    }

    @Override
    public void sprint(int speed) {
        System.out.println(name+" is spriniting at a speed of "+speed+".");
    }

    @Override
    public void walk(int speed) {
        System.out.println(name+" is walking at a speed of "+speed+".");
    }

    @Override
    public void jump(int height) {
        System.out.println(name+" has jumped to a height of "+height+".");
    }

    @Override
    public boolean fastTravel(String place) {
        System.out.println(name+" has travelled to "+place+".");
        return true;
    }
}
