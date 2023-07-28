//Program-2 (Q)
//Given a number, check whether it is a prime number or not.
//        Input 1
//        3
//        Output 1
//        Yes
//        Input 2
//        4
//        Output 2
//        No
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // We only need to check divisibility up to the square root of the number
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false; // If it's divisible by any number between 2 and the square root, it's not prime
            }
        }
        return true;
    }
}