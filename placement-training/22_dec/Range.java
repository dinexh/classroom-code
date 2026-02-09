public class Range {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int start = 1;
        int end = 3;
        System.out.println(searchInRange(arr, target, start, end));
    }

    public static String searchInRange(int[] arr, int target, int index, int r) {
        int start = Math.max(0, index);
        int end = Math.min(arr.length - 1, r);
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return String.valueOf(i);
            }
        }
        return "out of range";
    }
}
