import java.util.Scanner;

public class linear_search_recu {
    static int linearSearch(int[] arr, int n, int key) {
        if (n < 0)
            return -1;
        if (arr[n] == key)
            return n;
        return linearSearch(arr, n - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, n - 1, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index " + index);
        sc.close();
    }
}
