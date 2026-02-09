public class SumOfDigits {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int[] nums = {12345, 9876, 1001, 555};
        for (int n : nums)
            System.out.println("Sum of digits of " + n + " = " + sumDigits(n));
    }
}
