package Prep;

public class StringRightAngle {

    public static void main(String[] AK) {

        String s = "Java";

        char[] arr = s.toUpperCase().toCharArray();

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=i;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
