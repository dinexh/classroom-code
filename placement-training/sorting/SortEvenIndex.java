import java.util.Arrays;

public class SortEvenIndex {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        bubbleSortEvenIndex(arr);
        
        System.out.println("After sorting even indices only: " + Arrays.toString(arr));
    }
    
    public static void bubbleSortEvenIndex(int[] arr) {
        int n = arr.length;
        
        
        int evenCount = (n + 1) / 2;
        
        for (int i = 0; i < evenCount - 1; i++) {
            for (int j = 0; j < evenCount - i - 1; j++) {
                int index1 = j * 2;
                int index2 = (j + 1) * 2;
                
                if (index2 < n && arr[index1] > arr[index2]) {
                    int temp = arr[index1];
                    arr[index1] = arr[index2];
                    arr[index2] = temp;
                }
            }
        }
    }
}

