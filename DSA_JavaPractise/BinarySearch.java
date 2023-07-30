package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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

        System.out.print("Element to be searched: ");
        int target = x.nextInt();

        Arrays.sort(arr);

        int index = binarySearchAlgo(arr,target);

        if (index != -1) System.out.println("Element is found @ Index:"+index);
        else System.out.println("Element \"Not Found\"");
    }

    public static int binarySearchAlgo(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
