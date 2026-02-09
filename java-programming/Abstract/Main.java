public abstract class Shape {
  // Abstract method to define the calculateArea functionality
  public abstract double calculateArea();
}

public class Square extends Shape {
  private double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }

  // Override the abstract method to calculate area for a square
  @Override
  public double calculateArea() {
    return sideLength * sideLength;
  }
}

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  // Override the abstract method to calculate area for a circle
  @Override
  public double calculateArea() {
    final double PI = Math.PI; // Use Math.PI constant for circle area
    return PI * radius * radius;
  }
}

public class Main {
  public static void main(String[] args) {
    // You cannot create an object of the abstract class Shape directly
    // Shape shape = new Shape();  // This would cause an error

    // Create objects of the subclasses (concrete classes)
    Square square = new Square(5);
    Circle circle = new Circle(3);

    // Call the calculateArea method on the objects (polymorphism)
    System.out.println("Area of square: " + square.calculateArea());
    System.out.println("Area of circle: " + circle.calculateArea());
  }
}

