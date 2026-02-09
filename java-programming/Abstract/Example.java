// Abstract class representing a vehicle
abstract class Vehicle {
    // Abstract method for starting the vehicle
    public abstract void start();
    
    // Abstract method for stopping the vehicle
    public abstract void stop();
    
    // Concrete method for displaying a message
    public void displayMessage() {
        System.out.println("This is a vehicle.");
    }
}

// Concrete subclass representing a Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}

public class Example {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.displayMessage();
        car.start();
        car.stop();
        
        Vehicle motorcycle = new Motorcycle();
        motorcycle.displayMessage();
        motorcycle.start();
        motorcycle.stop();
    }
}

