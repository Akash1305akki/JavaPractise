package DSA_JavaPractise.LeetCodePractise;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {

        // Filling the unwanted places of array_1 with elements from array_2 ...
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1; // Index for the last element of nums1
        int index2 = n - 1; // Index for the last element of nums2
        int mergedIndex = m + n - 1; // Index for the last position in the merged array

        // Merge from the end of both arrays to the beginning
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] >= nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }
}
