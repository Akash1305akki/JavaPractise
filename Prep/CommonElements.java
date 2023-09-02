package Prep;

import java.util.Arrays;

public class CommonElements {

    public static void main(String[] Ak) {

        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {4,2,9};
        int count1=0,count2=arr1.length+arr2.length;

        for (int i=0;i<arr1.length;i++){
            int temp=0;
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]) {
                    count1++;
                    temp++;
                    break;
                }
            }
            if (temp==1){
                count2=count2-2;
            }
        }

        int[] common = new int[count1];
        int[] unCommon = new int[count2];

        count1=0;
        count2=0;

        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    common[count1++] = arr1[i];
                    break;
                }
            }
        }

        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]!=arr2[j]){
                    unCommon[count2++]=arr1[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(common));
        System.out.println(Arrays.toString(unCommon));

    }
}
