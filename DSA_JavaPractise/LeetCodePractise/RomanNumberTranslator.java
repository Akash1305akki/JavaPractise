package DSA_JavaPractise.LeetCodePractise;

import javax.naming.BinaryRefAddr;

public class RomanNumberTranslator {

    public static void main(String[] Ak) {
        // Find the Numeric conversion value of given Roman-String...
        String s = "VI";
        int count=0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='I'||s.charAt(i)=='V'||s.charAt(i)=='X'||s.charAt(i)=='L'||s.charAt(i)=='C'||s.charAt(i)=='D'||s.charAt(i)=='M'){
                count++;
            }
        }

        int ans = 0;

        if (count==s.length()){
            ans = logic(s);
        }else {
            System.out.println("Invalid Roman Number...");
        }

        System.out.println("Your ans is: "+ans);
    }

    public static int logic(String s) {
        int ans=0;

        char[] con = s.toCharArray();

        for (int i=0;i<con.length;i++){

            switch (con[i]){
                case 'I':{
                    if (i <= con.length-2) {
                        if (con[i + 1] == 'V') {
                            ans = ans + 4;
                            i++;
                        } else if (con[i+1] == 'X') {
                            ans = ans + 9;
                            i++;
                        }
                    } else {
                        ans = ans + 1;
                    }

                    break;
                } case 'V':{
                    if (ans<5) {
                        ans = 5 - ans;
                    }else {
                        ans = ans + 5;
                    }
                    break;
                } case 'X':{
                    if (ans < 10) {
                        ans = 10 - ans;
                    }else {
                        ans = ans + 10;
                    }
                    break;
                }case 'L':{
                    if (ans < 50) {
                        ans = 50 - ans;
                    }else {
                        ans = ans + 50;
                    }
                    break;
                }case 'C':{
                    if (ans < 100) {
                        ans = 100 - ans;
                    }else {
                        ans = ans + 100;
                    }
                    break;
                }case 'D':{
                    if (ans < 500) {
                        ans = 500 - ans;
                    }else {
                        ans = ans + 500;
                    }
                    break;
                }case 'M':{
                    if (ans < 1000) {
                        ans = 1000 - ans;
                    }else {
                        ans = ans + 1000;
                    }
                    break;
                } default:{
                    System.out.println("Invalid Roman...");
                    break;
                }
            }
        }

        return ans;
    }
}
