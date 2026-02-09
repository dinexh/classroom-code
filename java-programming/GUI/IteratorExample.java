import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Get an iterator for the list
        Iterator<String> iterator = myList.iterator();

        // Iterate over the elements using hasNext() and next() methods
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
