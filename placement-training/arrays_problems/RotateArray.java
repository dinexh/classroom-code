import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            k = k % n;
            int[] res = new int[n];
            int idx = 0;

            for (int i = n - k; i < n; i++) res[idx++] = a[i];
            for (int i = 0; i < n - k; i++) res[idx++] = a[i];

            for (int i = 0; i < n; i++) System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
