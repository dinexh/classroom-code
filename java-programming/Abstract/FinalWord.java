// Final class
final class FinalClass {
    // Final variable
    final int MAX_VALUE = 100;

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Attempting to subclass a final class (will result in a compilation error)
// class SubFinalClass extends FinalClass { }

// Attempting to override a final method (will result in a compilation error)
// class SubFinalMethodExample extends FinalClass {
//     @Override
//     void display() {
//         System.out.println("Attempting to override a final method.");
//     }
// }

public class FinalWord {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Maximum Value: " + obj.MAX_VALUE);
        obj.display(); // Output: This is a final method.
    }
}

