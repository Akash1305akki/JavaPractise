package DSA_JavaPractise.LeetCodePractise;

import java.util.Arrays;

public class RemoveDuplicatesBySort {

    public static void main(String[] Ak) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // The expected answer with correct length

        int k = removeDuplicates(nums);// Calls your implementation

        int[] expectedNums = new int[k];

        for (int i = 0; i < k; i++) {
            expectedNums[i] = nums[i];
        }

        System.out.println(Arrays.toString(expectedNums));
    }

    public static int removeDuplicates(int[] nums) {

        int k = 0;

        //Sorting the array...(Bubble-Sort)
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if (nums.length > 2) {
            //Shifting Wanted and Deleting Unwanted.....

            for (int a = 0; a < nums.length; a++) {
                int check = nums[a];
                int counter = 1;

                for (int b = a+1; b < nums.length; b++){
                    if (nums[b]==check){
                        counter++;
                    }
                }

                while (counter>1){
                    for (int c = a+1; c < nums.length-1;c++){
                        nums[c] = nums[c+1];
                    }
                    counter--;
                }
            }
        } else if (nums.length==2) {
            int f = 0;
            if (nums[f]==nums[f+1]){
                k = 1;
            }
        } else {
            k = 0;
        }

        //To Remove Unwanted Elements...
        if (nums.length > 2){
            int high = nums[nums.length-1];

            for (int i=nums.length-1;i>=0;i--){
                if (nums[i]==high){
                    k++;
                }else {
                    k = k - 1;
                    break;
                }
            }
        }

        if(k!=nums.length){
            k = nums.length-k;
        }else{
            k=1;
        }

        return k;
    }
}
