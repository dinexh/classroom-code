import java.util.*;

public class TwoSumHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int S = sc.nextInt();
            HashSet<Integer> seen = new HashSet<>();
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int need = S - arr[i];
                if (seen.contains(need)) {
                    System.out.println(need + " " + arr[i]);
                    found = true;
                    break;
                }
                seen.add(arr[i]);
            }

            if (!found) {
                System.out.println("No Match");
            }
        }
        sc.close();
    }
}
