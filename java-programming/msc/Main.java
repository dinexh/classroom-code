interface MyInterface {
    // Abstract method (no body)
    void myAbstractMethod();

    // Default method with a body
    default void myDefaultMethod() {
        System.out.println("This is a default method in MyInterface");
    }

    // Static method with a body
    static void myStaticMethod() {
        System.out.println("This is a static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    // Implementing the abstract method
    public void myAbstractMethod() {
        System.out.println("Implementing myAbstractMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myAbstractMethod(); // Output: Implementing myAbstractMethod
        obj.myDefaultMethod();  // Output: This is a default method in MyInterface
        MyInterface.myStaticMethod();  // Output: This is a static method in MyInterface
    }
}

