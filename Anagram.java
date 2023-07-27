package CognitivePrep;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.println("Anagram Checking ...");
        System.out.print("Enter String 1: ");
        String s1=x.next();
        System.out.print("Enter String 2: ");
        String s2=x.next();

        if (anagramLogic(s1,s2)) System.out.println("The Given Strings are \"Anagram\" to each other");
        else System.out.println("The Given Strings are \"Not Anagram\" to each other");
    }

    public static boolean anagramLogic(String s1,String s2){

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}