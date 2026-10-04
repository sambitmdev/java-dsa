package arrays;

import java.util.Arrays;

public class N01ArrayConcat {
    public static int[] concatBruteForce(int[] arr){
        int length = arr.length;
        int[] result = new int[2*length];
        for (int i = 0; i < length; i++){
            result[i] = arr[i];
        }
        for (int j = 0; j < length ; j++){
            result[length+j] = arr[j];
        }
        return result;
    }

    public static int[] concatOptimal(int[] arr){
        int length = arr.length;
        int[] result = new int[2*length];
        for (int i = 0; i < length; i++){
            result[i] = arr[i];
            result[length+i] = arr[i];
        }
        return result;
    }


    public static void main(String[] args) {
        //int[] result = Q01ArrayConcat.concatBruteForce(new int[]{1,2,3,4,5});
        int[] result = N01ArrayConcat.concatOptimal(new int[]{1,2,4,1});
        System.out.println(Arrays.toString(result));
    }
}
