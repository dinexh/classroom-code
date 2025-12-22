import java.util.Scanner;

public class binary_serach_recu {
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return binarySearch(arr, mid + 1, high, key);
        else
            return binarySearch(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, 0, n - 1, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index " + index);
        sc.close();
    }
}
