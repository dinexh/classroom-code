public class TryBlock{
public static void main (String args[])
{
try {
    // Code that may throw an exception
    int result = 10 / 0; // This will throw an ArithmeticException
} catch (ArithmeticException e) {
    // Handling the exception
    System.out.println("An arithmetic exception occurred: " + e.getMessage());
}
}
}
