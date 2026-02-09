import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Access elements by index
        System.out.println("Element at index 0: " + vector.get(0)); // Output: 10

        // Iterate over the elements of the vector
        System.out.println("Elements of the vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Update an element at a specific index
        vector.set(1, 50);

        // Remove an element from the vector
        vector.removeElement(30);

        // Check if the vector contains a specific element
        System.out.println("Contains 30? " + vector.contains(30)); // Output: false

        // Get the size of the vector
        System.out.println("Size of the vector: " + vector.size()); // Output: 2
    }
}

