public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int t = arr[left];
            arr[left++] = arr[right];
            arr[right--] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        reverse(arr);
        System.out.print("Reversed: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
