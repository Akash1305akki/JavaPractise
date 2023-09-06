package DSA_JavaPractise.LeetCodePractise;

public class ProfitFinder {

    public static void main(String[] Ak) {
        //Find the highest positive difference between 2 elements of an array

        int[] price = {7,1,5,4,3,6,2};

        int k = maxProfit(price);

        System.out.println("Profit that can be obtained is: "+k);
    }

    public static int maxProfit(int[] price) {

        int profit=0;

        for(int i=0;i<price.length-1;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[j]-price[i]>profit){
                    profit = price[j]-price[i];
                }
            }
        }

        return profit;
    }
}
