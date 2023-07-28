//Program-3 (Q)
//Given an array of numbers, arrange them in a way that it forms the largest value.
//        Input
//        [54, 546, 548, 60]
//        Output
//        6054854654
//
//        Note
//        The arrangement 6054854654 gives the largest value.

import java.util.Arrays;
import java.util.Comparator;

public class LargestValueArrangement {
    public static void main(String[] args) {
        int[] nums = {54, 546, 548, 60};
        String largestValue = arrangeLargestValue(nums);
        System.out.println("Output: " + largestValue);
    }

    public static String arrangeLargestValue(int[] nums) {
        // Convert the integer array to a string array for custom sorting
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }

        // Use a custom comparator to sort the strings in descending order
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare two numbers by concatenating them in different orders
                return (b + a).compareTo(a + b);
            }
        });

        // Concatenate the sorted strings to form the largest value
        StringBuilder result = new StringBuilder();
        for (String str : strArr) {
            result.append(str);
        }

        return result.toString();
    }
}