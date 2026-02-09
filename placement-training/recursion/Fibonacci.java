public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < 15; i++)
            System.out.print(fib(i) + " ");
        System.out.println();
    }
}
