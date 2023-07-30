package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.print("How many values do you want in your array: ");
        int range = x.nextInt();

        int arr[] = new int[range];

        for (int i = 0; i < range; i++) {
            System.out.print("Enter Value in " + (i + 1) + ": ");
            int n = x.nextInt();
            arr[i] = n;
        }

        System.out.println("Orginal Array is: " + Arrays.toString(arr));
        int[] arr1 = bubbleSort(arr, range);
        System.out.println("Array after Sorting is: " + Arrays.toString(arr1));
    }

    private static int[] bubbleSort(int[] arr, int len) {

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}