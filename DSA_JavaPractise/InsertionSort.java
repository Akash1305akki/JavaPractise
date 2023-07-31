package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        int[] arr1 = insertionSort(arr, range);
        System.out.println("Array after Sorting is: " + Arrays.toString(arr1));
    }

    private static int[] insertionSort(int[] arr, int len) {

        for (int i = 1; i < len; i++) {
            int temp=arr[i], pointer=i-1;
            while (pointer>=0 && arr[pointer] > temp){
                arr[pointer+1]=arr[pointer];
                pointer--;
            }
            arr[pointer+1]=temp;
        }
        return arr;
    }
}