public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min]) min = j;
            int t = arr[min]; arr[min] = arr[i]; arr[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        selectionSort(arr);
        System.out.print("Sorted:   ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
