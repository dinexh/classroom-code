import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // Removing a key-value pair
        map.remove("banana");

        // Retrieving value associated with a key
        System.out.println("Value associated with 'apple': " + map.get("apple")); // Output: 10
        System.out.println("Value associated with 'banana': " + map.get("banana")); // Output: null

        // Checking if a key exists
        System.out.println("Contains key 'banana': " + map.containsKey("banana")); // Output: false

        // Iterating over key-value pairs
        System.out.println("Key-Value pairs of HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

