import java.util.ArrayList;
import java.util.Scanner;

public class ChocolateWrapper {
    static Scanner x =new Scanner(System.in);
    static int balanceWrapper,balanceAmt;
    static ArrayList<Character> wrapperCount = new ArrayList<>();


    public static void main(String[] Ak) {
        System.out.println("How many Rs. do you have..?");
        int rs = x.nextInt();

        if (rs%2==0) {
            counter(rs);
        }else {
            balanceAmt++;
            rs--;
            counter(rs);
        }

        int ans = wrapperCount.size();
        System.out.println("Chocolate's ate: "+ans);
        System.out.println("Wrapper left: "+(balanceWrapper+1));
        System.out.println("Amount left: "+balanceAmt);
    }


    public static void counter(int inc){
        int w = 0;
        int iter=0;

        while (inc != 0) {
            w++;
            if (w == 2) {
                wrapperCount.add('W');
                iter++;
                w = 0;
            }
            inc--;
        }

        if ((iter%2==0)&&(iter!=0)){
            counter(iter);
        }else {
            balanceWrapper++;
            if ((iter-1!=0)&&(iter!=0)) {
                counter(iter - 1);
            } else if (balanceWrapper!=0) {
                balanceWrapper=balanceWrapper-2;
                counter(balanceWrapper+2);
            }
        }
    }
}
