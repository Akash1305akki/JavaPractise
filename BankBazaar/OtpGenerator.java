package ABC.src.BankBazaar;

import TabCinemas.ScreenOne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class OtpGenerator {
    static int n;
    static int index;
    static Scanner z = new Scanner(System.in);

    static FileWriter fw;

    public static void generate() {
        int limit=3;

        while (limit>0) {
            System.out.println();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter your Aadhaar Number: ");
            long check = z.nextLong();

            if (check == BankBazaar_Driver.B.getAadharNum()) {
                Random random = new Random();

                n = random.nextInt(9000) + 1000;
                try {
                    fw = new FileWriter("D://OTP.txt");

                    fw.write("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    fw.write("\n<   Your OTP is: " + n + "          >\n");
                    fw.write("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    fw.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Otp is generated in the location \"D:/\" under the name \"OTP\"");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                checker();
                break;
            } else {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Invalid Input...");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            limit--;
        }

        if (limit==0){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("User seems suspicious....");
            System.out.println("Auto Deactivate... ACTIVATED");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            BankBazaar_Driver.exit();
        }
    }

    private static void checker() {
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter the OTP: ");
        int a=z.nextInt();

        if (a==n){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Task Completed Successfully...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Invalid OTP...");
            System.out.println("Let's Generate again and try it...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            generate();
        }
    }

    public static void forgetPassword() {
        int limit=3;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->Regenerate Page<---");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        while (limit>0) {
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter your Aadhaar Number: ");
            long check = z.nextLong();

            if (BankBazaar_Driver.B.bA_no.contains(check)) {
                index=BankBazaar_Driver.B.bA_no.indexOf(check);
                Random random = new Random();

                n = random.nextInt(9000) + 1000;
                try {
                    fw = new FileWriter("D://Password_OTP.txt");

                    fw.write("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    fw.write("\n<   Your OTP is: " + n + "          >\n");
                    fw.write("\n<     (To change password)     >\n");
                    fw.write("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    fw.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Otp is generated in the location \"D:/\" under the name \"Password_OTP\"");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                forgetChecker();
                break;
            } else {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Invalid Aadhaar Number...\n Try again...");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            limit--;
        }

        if (limit==0){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("User seems suspicious....");
            System.out.println("Auto Deactivate... ACTIVATED");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            BankBazaar_Driver.exit();
        }else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->Enter New Credentials here<---");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter new password: ");
            String cPass = z.next();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            BankBazaar_Driver.B.bPwd.add(index,cPass);
            BankBazaar_Driver.B.bPwd.remove(index+1);
            System.out.println("Credential's Updated Successfully...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    private static void forgetChecker() {
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter the OTP: ");
        int a=z.nextInt();

        if (a==n){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Now You can Change Your Credentials....");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Invalid OTP...");
            System.out.println("Let's Generate again and try it...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            forgetPassword();
        }
    }

}
