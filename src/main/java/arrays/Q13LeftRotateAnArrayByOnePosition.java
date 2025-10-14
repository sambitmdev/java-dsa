package arrays;

import java.util.Arrays;

public class Q13LeftRotateAnArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{10,20,30,-40,50,0,60,70,-98,56,23,45,57};
        int[] arr3 = new int[]{2};
        rotateLeft(arr1);
        rotateLeft(arr2);
        rotateLeft(arr3);
    }

    public static void rotateLeft(int[] arr){
        ArrayUtils.validateArray(arr);
        if (arr.length==1){
            System.out.println("Single element - no rotation needed "+Arrays.toString(arr));
            return;
        }
        int temp = arr[0];
        for (int i=1;i< arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        ArrayUtils.printArray(arr);
    }
}
