package Prep;

public class SquareRootFinder {

    public static void main(String[] Ak) {
        int n = 6562;
        int ans = squareRoot(n);
        System.out.println(ans);
    }

    public static int squareRoot(int n) {
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