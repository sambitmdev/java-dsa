package arrays;

import java.util.Arrays;

public class Q02ReverseArrayElements {
    public static void main(String[] args) {
        int[] evenArr = new int[]{10,20,30,40,50,60};
        reverseArray(evenArr);
        System.out.println(Arrays.toString(evenArr));

        int[] oddArr = new int[]{10,20,30,40,50,60,70};
        reverseArray(oddArr);
        System.out.println(Arrays.toString(oddArr));

        int[] singleArr = new int[]{100};
        reverseArray(singleArr);
        System.out.println(Arrays.toString(singleArr));
    }

    public static void reverseArray(int[] arr){
        if (arr == null || arr.length<=1)
            return;
        int firstEle = 0;
        int lastEle = arr.length-1;
        while (firstEle < lastEle){
            int temp = arr[firstEle];
            arr[firstEle] = arr[lastEle];
            arr[lastEle] = temp;
            firstEle++;
            lastEle--;
        }
    }
}
