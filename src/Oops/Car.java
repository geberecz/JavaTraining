package Oops;

public class Car {
    Car() {
        System.out.println("Creating Contructor of Car Class");
    }
    String name = "Car segment";
    public void run() {
        System.out.println("Car is running");
    }

    public final void setWheels() {
        System.out.println("Only 4 wheels re allowed!");
    }
}
