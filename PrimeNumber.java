package CognitivePrep;

import java.util.Scanner;

public class PrimeNumber {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.print("Enter the value to check: ");
        int num = x.nextInt();

        int check = primeLogic(num);
        if (check==2) System.out.println("The Given Value is a \"Prime Number\". . .");
        else System.out.println("The Given Value is Not a \"Prime Number\". . .");
    }

    public static int primeLogic(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count += 1;
            }
        }
        return count;
    }
}