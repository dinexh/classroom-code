 import java.util.*;

public class Two {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 6, 7, 22);
        ListIterator<Integer> li = integerList.listIterator();

        // Forward iteration
        while (li.hasNext()) {
            System.out.print(li.next() + "\t");
        }
        System.out.println(); // New line

        // Reset the iterator to the beginning of the list
        li = integerList.listIterator();

        // Backward iteration
        while (li.hasNext()) {
            li.next(); // Move to the end of the list
        }
        while (li.hasPrevious()) {
            System.out.print(li.previous() + "\t");
        }
    }
}
