public class Appear_Element {

    static int count(int[] a, int n, int k) {
        if (n == 0)
            return 0;

        if (a[n - 1] == k)
            return 1 + count(a, n - 1, k);
        else
            return count(a, n - 1, k);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 4, 2, 5};
        int k = 2;

        System.out.println("Count = " + count(a, a.length, k));
    }
}


