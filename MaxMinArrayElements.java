//Program-5 (Q)
//Given an array of numbers, find the maximum and minimum element in the array.
//        Input
//        [54, 546, 548, 60]
//        Output
//        548 54

import java.util.Arrays;

public class MaxMinArrayElements {
    public static void main(String[] args) {
        int[] nums = {54, 546, 548, 60};
        int[] result = findMaxMinElements(nums);
        System.out.println("Output: " + result[0] + " " + result[1]);
    }

    public static int[] findMaxMinElements(int[] nums) {
        int[] result = new int[2];
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        result[0] = nums[nums.length - 1]; // Maximum element
        result[1] = nums[0]; // Minimum element

        return result;
    }
}