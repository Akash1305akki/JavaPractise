public class Frequency {
    public static void main(String[]args){
        int []a={1,2,4,2,7,4,3,1,8,-1,-2,-1,-1,0,-2,0,-1};
        int[]freq=new int[a.length];

        int count=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=-1) {
                freq[i] = count+1;
            }
            count=0;
        }

        for (int b=0;b<freq.length;b++){
            if (freq[b]!=-1){
                System.out.println("Frequency of "+a[b]+" is "+freq[b]);
            }
        }
    }
}
