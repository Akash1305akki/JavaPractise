package CognitivePrep;

import java.util.*;

public class FibonacciSeries {

    static Scanner x = new Scanner(System.in);
    static int n1 = 0, n2 = 1, n3;

    public static void main(String[] Ak)
    {
        System.out.print("Enter the value of N: ");
        int N = x.nextInt();

        System.out.print("First "+N+" Fibonacci Number's are: ");
        if (N==1){
            System.out.print(" "+n1+",");
        } else if (N==2) {
            System.out.print(" "+n1+",");
            System.out.print(" "+n2+",");
        }else {
            System.out.print(" "+n1+",");
            System.out.print(" "+n2+",");
            fibonacciLogic(N);
        }
    }

    private static void fibonacciLogic(int N){
        for(int i=2;i<N;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3+",");
            n1=n2;
            n2=n3;
        }
    }
}