package adityakm;

public class Vehicle {
    private String type;
    private int wheels;

    Vehicle(String type, int wheels){
        this.type = type;
        this.wheels = wheels;
    }

    protected void move (int speed){
        System.out.println("The vehicle is moving at a speed of "+speed+".");
    }

    protected void turn (String direction){
        System.out.println("The vehicle has directed towards "+direction+".");
    }
}
