package ABC.src.BankBazaar;

import java.util.Scanner;

public class BankBazaar_Driver {
    static boolean services=false, isSignedUp=false, isLoggedIn=false, card,run=true, runLoan=false, runCard=false, runVisa=false;
    static String uName,uPwd;
    static long aNum;

    static Scanner x= new Scanner(System.in);
    static BankBazaar_Imp B = new BankBazaar_Imp();

    static {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||--->Welcome to Bank Bazaar<---||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t|\t\t\t\t\tEmpower Your Financial Journey with our All-in-One App!\t\t\t\t\t\t |" +
                           "\n\t\t\t\t\t\t\t\t|\tExperience the Ease of Instant Loans, Seamless Card Services and Expedited Visa Processing.\t |" +
                           " \n\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\tYour Financial Needs, Instantly Fulfilled!\t\t\t\t\t\t\t |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] Ak) {

        while (run==true) {

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->Choose the task you want to perform<--");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1. SignUp.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2. LogIn.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3. Check Some Services.");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t4. Exit Application");
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

            int choice = x.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    signUp();
                    break;
                } case 2: {
                    if (isSignedUp == true) {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        logIn();
                    } else {
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("You don't have an account....\nLet's create your account first...");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        signUp();
                    }
                    break;
                } case 3: {
                    services = true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    Services(null);
                    break;
                } case 4:{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    exit();
                    break;
                } default: {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Invalid Choice....");
                    System.out.println("Try Again Boss...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    private static void signUp() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->Sign-Up Page<---");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter user name: ");
        uName = x.next();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter your Aadhaar Number: ");
        aNum = x.nextLong();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tCreate a password: ");
        uPwd = x.next();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        if (B.bUser.contains(uName)&&B.bA_no.contains(aNum)){
            System.out.println("User Already Exist...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }else {
            System.out.println("Account Registered Successfully...");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            B.setcName(uName);
            B.bUser.add(uName);
            B.setAadharNum(aNum);
            B.bA_no.add(aNum);
            B.bPwd.add(uPwd);
            isSignedUp=true;
        }
    }

    private static void logIn() {
        int attempt=3;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->Log-In Page<---");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        while ((attempt>0)&&(isLoggedIn==false)){
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter your user name: ");
            String name= x.next();
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter a password: ");
            String pwd=x.next();

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            if ((B.bUser.contains(name))&&(B.bPwd.contains(pwd))){
                if ((B.bUser.indexOf(name)) == (B.bPwd.indexOf(pwd))){
                    isLoggedIn = true;
                    services = true;
                    System.out.println("Log-In Successful...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    BankBazaar_Driver.Services(name);
                    break;
                }
            } else {
                attempt--;
                System.out.println("Invalid Credentials...\nTry Again Boss...");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if (attempt==0){
                OtpGenerator.forgetPassword();
            }
        }
    }

    public static void Services(String name) {

        while(services==true) {
            int choice;
            if (isLoggedIn==true) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->"+name);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Welcome "+name+", How can we help you with our Services...");
                System.out.println();
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1. Loan Categories.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2. Card Category.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3. Visa Category.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t4. Get back 1 step(#Log_Out).");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

                choice = x.nextInt();
                x.nextLine();
            }else {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->Sign Up");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->Log In");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--->The Available Services of BankBazaar are<---");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t1. Loan Categories.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2. Card Category.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t3. Visa Category.");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t4. Get back 1 step(#Log_Out).");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tChoice: ");

                choice = x.nextInt();
                x.nextLine();
            }

            switch (choice) {
                case 1: {
                    runLoan=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    B.loanCategory();
                    break;
                }
                case 2: {
                    runCard=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    B.cardCategory();
                    break;
                }
                case 3: {
                    runVisa=true;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    B.visaCategory();
                    break;
                }
                case 4: {
                    services=false;
                    isLoggedIn=false;
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
                default: {
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Invalid Choice....from driver");
                    System.out.println("Try Again Boss...");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    public static void exit(){
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||--->Thank You So much for using Bank Bazaar<---||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        run=false;
    }

}