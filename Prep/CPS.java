package Prep;

import java.util.Arrays;
import java.util.Scanner;

public class CPS {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        int ans = 0;

        programOne(ans);
        //=================================================================================================

        System.out.println("Enter the number of input's: ");
        int size = x.nextInt();

        int[] arr = new int[size];
        float mean = 0;
        //Getting array inputs..
        for (int i=0;i<size;i++){
            System.out.print("Enter element: ");
            arr[i] = x.nextInt();
            mean += arr[i];
        }

        mean /= size;
        System.out.println(mean);

        programTwo(arr,mean);
        //=================================================================================================

        System.out.println("Enter the number of input string's: ");
        int cap = x.nextInt();

        String[] s_arr = new String[cap];
        int[] i_arr = new int[cap];

        for (int i=0;i<cap;i++){
            System.out.print("Enter element: ");
            s_arr[i] = x.next();
            int counter = 0;
            for (int j=0;j<s_arr[i].length();j++){
                if (s_arr[i].charAt(j)!='A'&&s_arr[i].charAt(j)!='E'&&s_arr[i].charAt(j)!='I'&&s_arr[i].charAt(j)!='O'&&s_arr[i].charAt(j)!='U'){
                    if (s_arr[i].charAt(j)!='a'&&s_arr[i].charAt(j)!='e'&&s_arr[i].charAt(j)!='i'&&s_arr[i].charAt(j)!='o'&&s_arr[i].charAt(j)!='u'){
                        counter++;
                    }
                }
            }

            //Assigning the number of consonant's present for each string in a different array...
            if (counter>0){
                i_arr[i] = counter;
            }else {
                i_arr[i] = s_arr[i].length();
            }
        }

        programThree(s_arr, i_arr);
        //=================================================================================================
    }

    //=================================================================================================
    public static void programOne(int ans) {
        for (int i=0; i<1000; i++){
            if (i%2==1){
                if (i%3==2){
                    if (i%4==3){
                        if (i%5==4){
                            if (i%6==5){
                                if (i%7==0){
                                    ans = i;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("The Least Number which satisfies the given condition's is: "+ans);
        System.out.println();
    }

    //=================================================================================================
    public static void programTwo(int[] arr, float mean) {


        //Elements Lower than mean...
        System.out.print("Elements Lower than mean value are: ");
        for (int i=0;i<arr.length;i++){
            if (arr[i] < mean){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        //Elements Lower than mean...
        System.out.print("Elements Equal's to mean value are: ");
        int c1 = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == mean){
                System.out.print(arr[i]+" ");
                c1++;
            }
        }
        if (c1==0){
            System.out.print(" There are NO Element's Equal to the Mean Values...");
        }
        System.out.println();

        //Elements Higher than mean...
        System.out.print("Elements Higher than mean value are: ");
        for (int i=0;i<arr.length;i++){
            if (arr[i] > mean){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    //=================================================================================================
    public static void programThree(String[] s_arr, int[] i_arr) {

        //BubbleSort ...
        for (int i=0;i< s_arr.length;i++){
            for (int j=i+1;j< s_arr.length;j++){
                //checking number of consonants of each string from s_arr by the value assigns in i_arr...
                if (i_arr[i] > i_arr[j]){
                    //swapping the contents of s_arr...
                    String temp = s_arr[i];
                    s_arr[i] = s_arr[j];
                    s_arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(s_arr));
    }
}
