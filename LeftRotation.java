package CognitivePrep;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        int []  a={1,2,3,4,5};

        System.out.println("Enter Rotatory Count: ");
        int r=x.nextInt();

        for (int n=0;n<r;n++){
            int temp = a[0];
            for (int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
}