import java.util.*;
class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] count = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (count[i] == -1) continue;
                count[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count[i]++;
                        count[j] = -1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (count[i] > 0)
                    System.out.println(a[i] + " -> " + count[i]);
            }
            System.out.println();
        }
    }
}
