package TinyOLA;

import java.util.Objects;
import java.util.Scanner;

public class TinyDriver {
    static Scanner x = new Scanner(System.in);
    static boolean loggenIn=false;

    static {
        System.out.println("\t\t\t\t\t--->Welcome to OLA<---");
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] Ak){
        TinyDriver d = new TinyDriver();
        OLA o = new OLA();
        while (loggenIn==false) {
            System.out.println("Choose you operation:-");
            System.out.println("\t\t 1.Sign-In(->New Use)");
            System.out.println("\t\t 2. LogIn(->Already Registered)");
            System.out.print("\t\t\t---> ");
            int choise = x.nextInt();
            System.out.println("-------------------------------------------------------");
            System.out.println();

            switch (choise) {
                case 1: {
                    System.out.println("-->SignUp Page: Let's register your account...");
                    d.signUp(o);
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("-->LogIn Page: Let's log in and surf cab's...");
                    d.logIn(o);
                    break;
                }
                default: {
                    System.out.println("Invalid Input try again...");
                    System.out.println();
                }
            }
        }
    }

    public void signUp(OLA o) {
        System.out.print("Enter User Name: ");
        String s_name=x.next();
        o.setC_name(s_name);

        System.out.print("Enter User Password: ");
        String s_pwd=x.next();
        o.setPwd(s_pwd);

        System.out.print("Enter User Mobile Number: ");
        long s_no=x.nextLong();
        o.setC_no(s_no);
    }

    public static void logIn(OLA o) {
        System.out.print("Enter User Name: ");
        String l_name=x.next();

        System.out.print("Enter User Password: ");
        String l_pwd=x.next();

        logInCheck(o,l_name,l_pwd);
    }

    public static void logInCheck(OLA o, String l_name, String l_pwd) {
        String c_name=o.getC_name();
        String c_pwd=o.getPwd();

        if ((Objects.equals(l_name, c_name))&&(Objects.equals(l_pwd, c_pwd))){
            System.out.println("-------------------------------------------------------");
            System.out.println();
            chooseCab();
        }else {
            System.out.println("Invalid Credentials... Enter Again...");
            System.out.println("-------------------------------------------------------");
            System.out.println();
            logIn(o);
        }
    }

    public static void chooseCab() {
        float price=0;
        boolean loop=true;
        loggenIn=true;
        while (loop==true) {
            System.out.println("Choose your cab:-");
            System.out.println("\t\t 1. Mini");
            System.out.println("\t\t 2. Micro");
            System.out.println("\t\t 2. Sedan");
            int cab = x.nextInt();

            switch (cab) {
                case 1: {
                    Mini m = new Mini();
                    price = m.price;
                    loop=false;
                    break;
                }
                case 2: {
                    Micro m = new Micro();
                    price = m.price;
                    loop=false;
                    break;
                }
                case 3: {
                    Sedan s = new Sedan();
                    price = s.price;
                    loop=false;
                    break;
                }
                default: {
                    System.out.println("Invalid Input try again...");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                }
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.print("Enter your destination distance in Km: ");
        int km = x.nextInt();
        System.out.println("-------------------------------------------------------");
        System.out.println("The Price for your destination is: " + (km * price));
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t-->Thank you for choosing OLA<--");
        System.out.println("-------------------------------------------------------");
    }
}