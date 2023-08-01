package CognitivePrep;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
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

        System.out.print("Element the value of Nth: ");
        int nTh = x.nextInt();

        int large=arr[0];

        for (int k=1;k<=nTh;k++){
            large=0;
            for (int a=0;a<arr.length;a++){
                if (large<arr[a]){
                    large=arr[a];
                }
            }

            for (int b=0;b<arr.length;b++){
                if (large==arr[b]){
                    arr[b]=0;
                }
            }
        }
        System.out.println("The "+nTh+"Th Largest element in array is: "+large);
    }
}