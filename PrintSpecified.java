package ABC.src;

public class PrintSpecified {
    public static void main(String[] Ak) {
        String s="a2b3d5c4";

        //Print the output as: aa bbb dddd cccc

        char[] ch=s.toCharArray();

        int index=0;

        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                int m=Integer.parseInt(String.valueOf(ch[j]));
                if (index==i){
                    for(int k=0;k<m;k++){
                        System.out.print(ch[i] );
                    }
                    break;
                }
            }
            System.out.print(" ");
            index+=2;
            i++;
        }
    }
}
