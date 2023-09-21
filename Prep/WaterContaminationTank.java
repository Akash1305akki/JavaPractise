package Prep;

import java.util.Scanner;

public class WaterContaminationTank {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.print("Enter the no.of rows: ");
        int N = x.nextInt();

        String ip = "";

        for (int i=1;i<=N;i++){
            ip = ip + x.next();
        }

        char[] arr = ip.toCharArray();

        for (int a=0;a<arr.length;a++){

            //To Check Next Row Element...
            if ((a%N<=N-1) && (a < N*(N-1)) ){
                if (arr[a+N]=='C' && arr[a]!='R'){
                    arr[a]='C';
                }
            }

            //To Check Next Column Element...
            if (a%N!=N-1){
                if (arr[a+1]=='C' && arr[a]!='R'){
                    arr[a]='C';
                }
            }

            //To Check Previous Column Element...
            if (a%N!=0){
                if (arr[a-1]=='C' && arr[a]!='R'){
                    arr[a]='C';
                }
            }

            //To print the Pattern
            System.out.print(arr[a]+" ");

            //To break the line after one row
            if (a%N==N-1){
                System.out.println();
            }
        }
    }
}