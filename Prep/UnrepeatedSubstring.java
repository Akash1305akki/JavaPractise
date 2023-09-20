package Prep;

public class UnrepeatedSubstring {

    public static void main(String[] Ak) {
        String s1 = "akash";
        String s2 = String.valueOf(s1.charAt(0));

        for (int i=1;i<s1.length();i++) {
            int count=0;
            for (int j=0;j<s2.length();j++){
                if (s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }

            if (count==0){
                s2 += String.valueOf(s1.charAt(i));
            }else {
                break;
            }
        }

        System.out.println(s2);
    }
}
