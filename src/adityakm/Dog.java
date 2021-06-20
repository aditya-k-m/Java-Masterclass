package adityakm;

public class Dog extends Animal{
    private String coat;
    private String colour;
    private String tail_length;

    public Dog(short legs, short eyes, String category, String coat, String colour, String tail_length) {
        super(legs, eyes, category);
        this.coat = coat;
        this.colour = colour;
        this.tail_length = tail_length;
    }

    public void waggleTail(){
        System.out.println("The dog is waggling its tail.");
    }

    public void walk(){
        move(5);
    }

    public void run(){
        move(10);
    }

    @Override
    public void move(int speed){
        System.out.println("The Dog is moving with a speed of "+speed+".");
    }
}
