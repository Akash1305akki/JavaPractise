//Program-4 (Q)
//Given a number N, print reverse of number N.
//        Input
//        988
//        Output
//        889
//        Note
//        Do not print leading zeros in output.
//        For example N = 100
//        Reverse of N should be 1 not 001.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseNumber(num);
        System.out.println("Output: " + reversedNumber);
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}