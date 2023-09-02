package Prep;

import java.util.Scanner;

public class Test {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("Name:");
            String s1 = s.nextLine();

            System.out.println("Enter num: ");
            int n = s.nextInt();
            s.nextLine();


            System.out.println(s1+" "+n);
    }
    }
}
