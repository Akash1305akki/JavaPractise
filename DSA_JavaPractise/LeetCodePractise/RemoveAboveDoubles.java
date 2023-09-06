package DSA_JavaPractise.LeetCodePractise;

import java.util.Arrays;

public class RemoveAboveDoubles {

    public static void main(String[] Ak) {
        //Not Allow More than 2 Occurrence of any Element...
        
        int[] nums = {0,0,1,1,2,2,2,2,2,3,3,3};

        int k = remover(nums);

        System.out.println(Arrays.toString(nums));

        for (int i=0;i<nums.length-k;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int remover(int[] nums) {
        int k=0;

        for (int i=0;i<nums.length;i++){
            int count=1;
            for (int j=i+1;j< nums.length;j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }

            if (count>2){
                k++;
                count = count-2;
                for (int f=0;f<count;f++){
                    for (int a=i+1;a<nums.length-1;a++){
                        if (nums[a]!=-1){
                            nums[a]=nums[a+1];
                        }else{
                            break;
                        }
                    }
                    nums[nums.length-1]=-1;
                }
            }
        }
        return k;
    }
}
