public class RotateArray {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int t = arr[left];
            arr[left++] = arr[right];
            arr[right--] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        rotateRight(arr, 3);
        System.out.print("Rotated by 3: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
