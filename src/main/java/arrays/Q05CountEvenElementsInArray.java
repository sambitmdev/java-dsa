package arrays;

import java.util.Arrays;

public class Q05CountEvenElementsInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{40,23,-12,45,1,-56,77,91,0};
        System.out.println("Number of even element in array of "+ Arrays.toString(arr)+ " is "+countEven(arr));
    }

    public static int countEven(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty or blank");
        }
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
