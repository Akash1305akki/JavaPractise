package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
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

        int index = linearSearchAlgo(arr,target);

        if (index != -1) System.out.println("Element is found @ Index:"+index);
        else System.out.println("Element \"Not Found\"");
    }

    public static int linearSearchAlgo(int[] arr, int target){

        int res=-1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                res=i;
                break;
            }
        }

        return res;
    }
}