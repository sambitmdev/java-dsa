package arrays;

public class ArrayUtils {
    public static void validateArray(int[] arr){
        if (arr == null){
            throw new IllegalArgumentException("Array is null");
        }
        if (arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        if (arr.length > 100_000){
            throw new IllegalArgumentException("Array is too big to perform operation safely");
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(java.util.Arrays.toString(arr));
    }


}
