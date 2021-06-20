package adityakm;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int wheels, boolean engine, int cylinders) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public void startEngine() {
        System.out.println("The Engine has been started.");
    }

    public void accelerate(int speed){
        System.out.println("The car is accelerating with a speed of "+speed+".");
    }

    public void brake(){
        System.out.println("The brakes have been applied.");
    }
}
