package arrays;

import java.util.Arrays;

public class Q11RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2};
        int[] arr2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr3 = new int[]{10, 10, 10, 10, 10};
        int[] arr4 = new int[]{5, 6, 7, 8, 9};

        int[] [] arrays = new int[] []{arr1,arr2,arr3,arr4};
        for (int[] arr : arrays){
            System.out.println(Arrays.toString(arr)+" after removing duplicate size is : "+removeDuplicates(arr));
        }
    }

    public static int removeDuplicates(int[] arr){
        ArrayUtils.validateArray(arr);

        if (arr.length == 1){
            return 1;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
