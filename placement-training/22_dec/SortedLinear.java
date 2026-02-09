public class SortedLinear {
    public static int findFirstGreater(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8, 10};
        int x = 4;
        int index = findFirstGreater(arr, x);
        
        if (index != -1) {
            System.out.println("First element > " + x + " is " + arr[index] + " at index " + index);
        } else {
            System.out.println("No element greater than " + x + " found.");
        }
    }
}
