import java.util.Scanner;

public class MaxMinEle {

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        MaxMinEle obj = new MaxMinEle();
        int max = obj.findMax(array); 
        int min = obj.findMin(array); 

        System.out.println("The Max element in the Array is = " + max);
        System.out.println("The Min element in the Array is = " + min);
    }
}
