//Program-1 (Q)
//        Write a program to print the reverse of the given string.
//        Input
//        codecode
//        Output
//        edocedoc
import java.util.Scanner;

public class ReverseString {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a string: ");
           String inputString = scanner.nextLine();
           scanner.close();

           String reversedString = reverseString(inputString);
           System.out.println("Output: " + reversedString);
       }

       public static String reverseString(String inputStr) {
           StringBuilder reversedStr = new StringBuilder();
           for (int i = inputStr.length() - 1; i >= 0; i--) {
               reversedStr.append(inputStr.charAt(i));
           }
           return reversedStr.toString();
       }
}