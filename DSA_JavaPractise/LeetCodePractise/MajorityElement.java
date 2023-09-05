package DSA_JavaPractise.LeetCodePractise;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] Ak) {
        int[] n = {2,2,1,1,1,2,2};

        int ans = majorityElement(n);

        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxElement=0;
        int max= 0;

        for(int a=0;a<nums.length;a++){
            int tempMax=1;
            for(int b=0;b<nums.length;b++){
                if(nums[a]==nums[b]){
                    tempMax++;
                }
            }

            if(tempMax > max){
                maxElement = nums[a];
                max=tempMax;
            }
        }

        return maxElement;
    }
}
