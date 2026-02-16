import java.util.*;
class MinimumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int diff = Math.abs(a[i] - a[j]);
                    if (diff < minDiff) minDiff = diff;
                }
            }

            System.out.println(minDiff);
        }
    }
}
