public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        insertionSort(arr);
        System.out.print("Sorted:   ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
