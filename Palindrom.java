import java.util.Scanner;

public class Palindrom {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.println("Check Palindrome for ...");
        System.out.println("1. String.");
        System.out.println("2. Integer.");
        int choise = x.nextInt();
        String res1;
        int res2;

        if (choise==1){
            System.out.print("Enter String: ");
            String g = x.next();
            if (stringCheck(g)) System.out.println("The Given String is a \"Palindrom\"...");
            else System.out.println("The Given String is \"Not a Palindrome\"...");
        } else if (choise==2) {
            System.out.print("Enter Integer: ");
            int g = x.nextInt();
            if (intCheck(g)) System.out.println("The Given Number is a \"Palindrom\"...");
            else System.out.println("The Given Number is \"Not a Palindrome\"...");
        }else {
            Palindrom.main(Ak);
        }
    }

    public static boolean stringCheck(String g){
        int left = 0;
        int right = g.length() - 1;

        while (left < right) {
            if (g.charAt(left) != g.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean intCheck(int g){
        int con=g;
        int check=0;
        while (g>0){
            int a = g%10;
            check = (check*10)+a;
            g=g/10;
        }
        return check==con;
    }
}
