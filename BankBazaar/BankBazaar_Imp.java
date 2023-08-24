package ABC.src.BankBazaar;

import java.util.Scanner;

import static ABC.src.BankBazaar.BankBazaar_Driver.*;

public class BankBazaar_Imp extends BankBazaar {
    static int tenurePeriod;
    static float rateOfInterest;

    static Scanner y = new Scanner(System.in);

    public BankBazaar_Imp() {
        super();
    }

    public BankBazaar_Imp(long aadharNum, String cName) {
        super(aadharNum, cName);
    }


    @Override
    public void loanCategory() {

        while (runLoan==true) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->You can apply for<---");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\ta. Personal Loan.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tb. Home Loan.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tc. Bike Loan.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\td. Educational Loan.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\te. Get Back.");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

            String L = y.next();

            switch (L){
                case "a":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 5 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=500000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 4) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 4;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                }case "A":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 5 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=500000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 4) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 4;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "b":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 10 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=1000000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 2) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 2;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "B":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 10 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=1000000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 2) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 2;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "c":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 2 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=200000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 6) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 6;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "C":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("You can apply up to 2 lakhs, \nEnter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=200000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 6) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 6;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "d":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("You can apply up to 5 lakhs,\n Enter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=500000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 4) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 4;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "D":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("You can apply up to 5 lakhs,\n Enter the amount you want to loan: ");
                    float amt = y.nextFloat();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (amt<=500000){
                        System.out.println("How much Tenure Period Would You Like to spend with this loan... ");
                        System.out.println("Remember Tenure Period is related to #Rate_Of_Interest as \"Rate_Of_Interest = (Tenure Period * 4) %...");
                        System.out.print("Enter Tenure Period(In Years): ");
                        tenurePeriod = y.nextInt();
                        rateOfInterest = tenurePeriod * 4;
                        loanDetails(amt);
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid amount requested...");
                        System.out.println("Choose again...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "e":{
                    runLoan=false;
                    services=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                } case "E":{
                    runLoan=false;
                    services=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }default:{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Invalid Choice....loan");
                    System.out.println("Try Again...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    @Override
    public void cardCategory() {
        while (runCard==true) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->You can apply for<---");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\ta. Debit Card.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tb. Credit Card.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tc. Get Back.");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

            String C = y.next();

            switch (C){
                case "a":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (BankBazaar_Driver.isLoggedIn==false){
                        System.out.println("Your card is not sanctioned...");
                        System.out.println("Create and log in a account... \nThen use this feature...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        OtpGenerator.generate();
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Your card is sanctioned...\n You'll be receiving your Debit Card in the next 6 Working days...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


                    }
                    break;
                }case "A":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (BankBazaar_Driver.isLoggedIn==false){
                        System.out.println("Your card is not sanctioned...");
                        System.out.println("Create and log in a account... \nThen use this feature...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        OtpGenerator.generate();
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Your card is sanctioned...\n You'll be receiving your Debit Card in the next 6 Working days...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "b":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (BankBazaar_Driver.isLoggedIn==false){
                        System.out.println("Your card is not sanctioned...");
                        System.out.println("Create and log in a account... \nthen use this feature");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        OtpGenerator.generate();
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Your card is sanctioned...\n You'll be receiving your Credit Card in the next 6 Working days...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "B":{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    if (BankBazaar_Driver.isLoggedIn==false){
                        System.out.println("Your card is not sanctioned...");
                        System.out.println("Create and log in a account... \nthen use this feature");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        OtpGenerator.generate();
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Your card is sanctioned...\n You'll be receiving your Credit Card in the next 6 Working days...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "c":{
                    runCard=false;
                    services=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }case "C":{
                    runCard=false;
                    services=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }default:{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Invalid Choice....");
                    System.out.println("Try Again...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    @Override
    public void citizenship() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The user is an Indian, His Aadhaar Number is: "+aNum);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void visaCategory() {
        while (runVisa==true) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->You can apply for<---");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\ta. Travel Visa.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tb. Student Visa.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tc. Business Visa.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\td. Get Back.");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

            String V=y.next();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            switch (V){
                case "a":{
                    System.out.println("If you wanna apply for Travel Visa it is valid only for 2 Years \n(if you didn't have a citizenship)...");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break ;
                }case "A":{
                    System.out.println("If you wanna apply for Travel Visa it is valid only for 2 Years \n(if you didn't have a citizenship)...");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break ;
                } case "b":{
                    System.out.println("If you wanna apply for Student Visa it is valid only for 5 Years....");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "B":{
                    System.out.println("If you wanna apply for Student Visa it is valid only for 5 Years....");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                } case "c":{
                    System.out.println("If you wanna apply for Business Visa it is valid for 5 Months....");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                }  case "C":{
                    System.out.println("If you wanna apply for Business Visa it is valid for 5 Months....");
                    System.out.println();
                    System.out.println("If you want to apply press \'Y\', else press \'N\': ");
                    String ch=y.next();
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                    if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
                        if (BankBazaar_Driver.isLoggedIn==true){
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            OtpGenerator.generate();
                        }
                        else {
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("You don't have an account first create an account and try again...");
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        }
                    } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
                        System.out.println("Going a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Invalid Input....\nGoing a step back...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                    break;
                }case "d":{
                    runVisa=false;
                    services=true;
                    break;
                }case "D":{
                    runVisa=false;
                    services=true;
                    break;
                }default:{
                    System.out.println("Invalid Choice...");
                    System.out.println("Try Again...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    public static void loanDetails(float amt){

        System.out.println("------------Loan Details------------");
        System.out.println("|-> Amount Request: Rs. "+amt);
        System.out.println("|-> Tenure Period: "+tenurePeriod+" Years");
        System.out.println("|-> Rate of Interest :"+rateOfInterest+" %");
        System.out.println("--------------------------------------");

        System.out.println("If you want to apply press \'Y\', else press \'N\': ");
        String ch=y.next();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        if (ch.equals("Yes") || ch.equals("yes") || ch.equals("y") || ch.equals("Y") || ch.equals("YES")){
            if (BankBazaar_Driver.isLoggedIn==true){
                loanProvider(amt);
            }
            else {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("You don't have an account first create an account and try again...");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        } else if (ch.equals("No") || ch.equals("no") || ch.equals("n") || ch.equals("N") || ch.equals("NO")) {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Going a step back...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Invalid Input....\nGoing a step back...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    public static void loanProvider(float amt) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tAre You Working?");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tAns: ");
        String employed = y.next();

        if (employed.equals("Yes") || employed.equals("yes") || employed.equals("y") || employed.equals("Y") || employed.equals("YES")){
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tYour Current Salary is: ");
            float sal = x.nextFloat();
            if (sal > (amt/12)){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Congratulation....!!!\nYou are eligible to access this feature..!!!");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                OtpGenerator.generate();
            }
        }else {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Your not eligible to access this feature..!!!");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
