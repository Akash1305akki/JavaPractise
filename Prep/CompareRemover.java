package Prep;

public class CompareRemover {

    public static void main(String[] Ak) {
        String s1 = "CODEEBBOARD";
        String s2 = "CODEBOARD";
        String s3 = "";
        int j=0;

        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==s2.charAt(j)){
                System.out.print(s1.charAt(i));
                j++;
                s3=s3+s1.charAt(i);
//            }else {
//                s3 = s1.replace(s1.charAt(i),' ');
            }
        }

        System.out.println();
        System.out.println(s3);
    }
}
