import java.util.Arrays;

public class RepeatedElement {

    public static void main(String[] Ak) {
        int[] n ={1,2,3,4,55,1,2,3,0,1};
        int count=0, temp=0;

        Arrays.sort(n);
        int small = n[0], large=n[n.length-1];

        System.out.println("Element: Count");

        for(int i=small;i<large+1;i++){
            for (int j=0;j<n.length;j++){
                if (i==n[j]){
                    temp = n[j];
                    count=count+1;
                }
            }
            if (temp==i){
                System.out.println(i+": "+count);
                count=0;
            }
        }
    }
}
