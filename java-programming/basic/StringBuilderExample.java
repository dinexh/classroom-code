public class StringBuilderExample {
    public static void main(String[] args) {
    // Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("Hello");
        // Append text to the StringBuilder
        stringBuilder.append(" World");
        System.out.println("Appended string: " + stringBuilder);
        // Insert text at a specific position
        stringBuilder.insert(5, ", ");
        System.out.println("Inserted string: " + stringBuilder);
        // Delete text from a specific position
        stringBuilder.delete(5, 7);
        System.out.println("Deleted string: " + stringBuilder);
        // Reverse the content of the StringBuilder
        stringBuilder.reverse();
        System.out.println("Reversed string: " + stringBuilder);
        // Replace text with another text
        stringBuilder.replace(0, 6, "Goodbye");
        System.out.println("Replaced string: " + stringBuilder);
        // Get the length of the StringBuilder
        int length = stringBuilder.length();
        System.out.println("Length of StringBuilder: " + length);
        // Get the capacity of the StringBuilder
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity of StringBuilder: " + capacity);
        // Ensure the capacity of the StringBuilder
        stringBuilder.ensureCapacity(20);
        System.out.println("Ensured capacity of StringBuilder: " +
        stringBuilder.capacity());
    }
}
