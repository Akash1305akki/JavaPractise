package DSA_JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class KadanesAlgorithm {
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

        int maxSum = kadanesLogic(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("The max sum of a Contiguous Sub-Array is: "+maxSum);
    }

    public static int kadanesLogic(int[] arr){
        int n=arr.length;
        int maxHere=0, maxSoFar=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            maxHere=maxHere+arr[i];
            if (maxSoFar<maxHere){
                maxSoFar=maxHere;
            }

            if (maxHere<0){
                maxHere=0;
            }
        }
        return maxSoFar;
    }

}