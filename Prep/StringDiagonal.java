package Prep;

public class StringDiagonal {
    public static void main(String[] AK) {

        String s = "JAVA";

        char[] arr = s.toUpperCase().toCharArray();


        for (int i=0;i<arr.length;i++){
            for (int j=0;j<=i;j++){
                if(i==j){
                    System.out.print(arr[j]+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
