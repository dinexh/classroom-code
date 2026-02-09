import java.util.Arrays;

public class Firsthalf {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 6, 2};
        sortFirstHalf(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortFirstHalf(int[] arr) {
        int n = arr.length;
        int half = n / 2;

        int[] firstHalf = Arrays.copyOfRange(arr, 0, half);
        Arrays.sort(firstHalf);
        for (int i = 0; i < half; i++) {
            arr[i] = firstHalf[i];
        }
    }
}