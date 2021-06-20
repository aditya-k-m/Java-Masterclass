package adityakm;

public class Animal {
    private short legs;
    private short eyes;
    private String category;

    public Animal(short legs, short eyes, String category) {
        this.legs = legs;
        this.eyes = eyes;
        this.category = category;
    }

    protected void move(int speed){
        System.out.println("The Animal is moving at a speed "+speed+".");
    }
    public void eat(){
        System.out.println("The Animal is eating.");
    }
}
