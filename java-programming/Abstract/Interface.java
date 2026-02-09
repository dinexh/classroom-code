// Interface representing an animal
interface Animal {
    void eat();
    void sleep();
}

// Interface representing a vehicle
interface Vehicle {
    void start();
    void stop();
}

// Concrete class implementing the Animal interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

// Concrete class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Using the Dog class
        Dog dog = new Dog();
        dog.eat();   // Output: Dog is eating.
        dog.sleep(); // Output: Dog is sleeping.

        // Using the Car class
        Car car = new Car();
        car.start(); // Output: Car is starting.
        car.stop();  // Output: Car is stopping.
    }
}

