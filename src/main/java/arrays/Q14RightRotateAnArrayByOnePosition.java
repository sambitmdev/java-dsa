package arrays;

import java.util.Arrays;

public class Q14RightRotateAnArrayByOnePosition {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{10,20,30,-40,50,0,60,70,-98,56,23,45,57};
        int[] arr3 = new int[]{2};
        rotateRight(arr1);
        rotateRight(arr2);
        rotateRight(arr3);
    }
    public static void rotateRight(int[] arr){
        ArrayUtils.validateArray(arr);
        if (arr.length==1){
            System.out.println("Single element - no rotation needed "+ Arrays.toString(arr));
            return;
        }
        int temp = arr[arr.length-1];
        for (int i=arr.length-2;i >= 0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        ArrayUtils.printArray(arr);
    }
}
