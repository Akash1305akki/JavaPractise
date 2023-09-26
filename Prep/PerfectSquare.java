package Prep;

public class PerfectSquare {
    public static void main(String[] Ak) {
        int n = 6561;
        int ans = perfectSquare(n);

        if (ans==0){
            System.out.println("The Perfect Square for given Number does not Exist...");
        }else {
            System.out.println("The Perfect Square for given Number is: "+ans);
        }
    }

    public static int perfectSquare(int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (i * i == n) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}