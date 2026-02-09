import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Removing element
        set.remove("banana");

        // Checking if element exists
        System.out.println("Contains 'apple': " + set.contains("apple")); // Output: true
        System.out.println("Contains 'banana': " + set.contains("banana")); // Output: false

        // Iterating over elements
        System.out.println("Elements of HashSet:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}

