public class ArrayDuplicates {
    public static void findFirstAndLast(int[] arr, int target) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println("First index: " + firstIndex);
        System.out.println("Last index: " + lastIndex);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        int target = 4;
        findFirstAndLast(arr, target);
    }
}
