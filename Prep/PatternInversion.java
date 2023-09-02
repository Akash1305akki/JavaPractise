package Prep;

import NumberAlgorithms.FactorialOfGiven;

public class PatternInversion {

    public static void main(String[] Ak) {

        String s = "ZOHO";

        int con=s.length()+1, rem =(con/2)-1;

        int space=1;

        for (int i=0;i<s.length()+1;i++){
            int j=0;

            while(j<con) {
                if (i < s.length()) {
                    System.out.print(s.charAt(i)+" ");

                } else {
                    System.out.print(" ");
                }
                j++;
            }



            if (con<0){
                if (rem>0){
                    System.out.print(s.charAt(i)+" ");
                    rem--;
                }
            }

            System.out.println();

            for (int c=0;c<space;c++){
                System.out.print("  ");
            }

            space++;

            con-=2;
        }
    }
}
