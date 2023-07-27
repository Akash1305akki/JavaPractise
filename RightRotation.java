package CognitivePrep;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        int []  a={1,2,3,4,5};

        System.out.println("Enter Rotatory Count: ");
        int r=x.nextInt();

        for (int n=0;n<r;n++){
            int temp = a[a.length-1];
            for (int i=a.length-1;i>0;i--){
                    a[i]=a[i-1];
            }
            a[0]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
}