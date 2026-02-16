import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                boolean seen = false;
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        seen = true;
                        break;
                    }
                }
                if (!seen) System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
