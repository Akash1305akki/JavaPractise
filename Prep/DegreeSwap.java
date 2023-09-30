package Prep;

import java.util.Arrays;
import java.util.Scanner;

public class DegreeSwap {
    static Scanner x = new Scanner(System.in);

    public static void main(String[] Ak) {
        System.out.print("Enter the number of rows and columns for a \'2-D Array\': ");
        int R = x.nextInt(), C = R;

        int[][] arr = new int[R][C];

        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                System.out.print("Enter the value for arr["+i+","+j+"]: ");
                arr[i][j] = x.nextInt();
            }
        }

        do {
            System.out.print("How much degree do you want to rotate: ");
            int rotate = x.nextInt();

            switch (rotate) {
                case 90: {
                    for (int i = 0; i < R; i++) {
                        for (int j = 0; j < C; j++) {
                            if (j >= i) {
                                int temp = arr[i][j];
                                arr[i][j] = arr[j][i];
                                arr[j][i] = temp;
                            }
                        }
                    }
                    break;
                }
                case 180: {
                    for (int i = 0; i < R; i++) {
                        for (int j = 0; j < C; j++) {
                            if (i < j / 2) {
                                int temp = arr[i][j];
                                arr[i][j] = arr[i][C - 1 - j];
                                arr[i][C - 1 - j] = temp;
                            }
                        }
                    }
                    break;
                }
            }

            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
        }while (true);
    }
}
