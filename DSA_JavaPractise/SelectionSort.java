package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        int[] arr1 = selectionSort(arr, range);
        System.out.println("Array after Sorting is: " + Arrays.toString(arr1));
    }

    private static int[] selectionSort(int[] arr, int len) {

        for (int i = 0; i < len - 1; i++) {
            int minIndex=i, temp;
            for (int j = i+1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
}