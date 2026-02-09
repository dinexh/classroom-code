public class MergeTwoArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            result[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 8};
        int[] b = {2, 3, 9};
        System.out.print("Array A: ");
        for (int x : a) System.out.print(x + " ");
        System.out.println();
        System.out.print("Array B: ");
        for (int x : b) System.out.print(x + " ");
        System.out.println();
        int[] merged = merge(a, b);
        System.out.print("Merged:  ");
        for (int x : merged) System.out.print(x + " ");
        System.out.println();
    }
}
