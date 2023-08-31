package ABC.src;

import java.util.Set;
import java.util.TreeSet;

public class divisorPdLogic {

    public static void main(String[] Ak) {

        //Let 'N' be the user's input...
        int N=12;

        Set<Integer> divisors = new TreeSet<>();
        Set<Integer> primeDivisors = new TreeSet<>();

        //Adding all the divisor's of 'N' in divisor(Set).
        //Adding all the prime divisor's of divisor(Set) in primeDivisor(Set).

        for (int i=1;i<=N;i++){
            if (N%i==0){
                //Add all divisor's in divisor(Set).
                divisors.add(i);

                //Find Prime Number or not logic.
                int count=0;
                for (int j=1;j<=i;j++){
                    if ((i%j==0)){
                        count++;
                    }
                }

                if ((count==2)&&(i!=1)){
                    //Add divisor in primeDivisor(Set), If it is a "Prime Number".
                    primeDivisors.add(i);
                }
            }
        }

        int fAns=1;

        for (int a:primeDivisors) {
            int c=0;
            for (int b:divisors) {
                //Counting the factors of elements present in divisor(Set).
                if (b%a==0){
                    c++;
                }
            }

            fAns=fAns*c;
        }

        System.out.println(fAns);
    }
}
