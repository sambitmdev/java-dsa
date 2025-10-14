package arrays;

import java.util.Arrays;

public class Q12RemoveDuplicatePrintArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2,2};
        int[] arr2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4,5};
        int[] arr3 = new int[]{10, 10, 10, 10, 10};
        int[] arr4 = new int[]{5, 6, 7, 8, 9};

        int[] [] arrays = new int[] []{arr1,arr2,arr3,arr4};
        for (int[] arr : arrays){
            int i = removeDuplicate(arr);
            System.out.println(Arrays.toString(arr)+" after removing duplicate size is : "+i);
            printArray1(arr,i);
        }
    }

    public static int removeDuplicate(int[] arr){
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

    public static void printArray1(int[] arr, int size){
        System.out.print("Unique Array: [");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i]);
            if (i < size -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("=======");
    }
}
