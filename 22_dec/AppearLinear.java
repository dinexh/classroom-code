public class AppearLinear {
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int element : arr) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int target = 2;
        System.out.println("Element " + target + " appears " + countOccurrences(arr, target) + " times.");
    }
}
