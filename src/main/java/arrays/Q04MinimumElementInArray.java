package arrays;

import java.util.Arrays;

public class Q04MinimumElementInArray {
    public static void main(String[] args) {
        int[] posValArr = new int[]{10,20,22,13,6,71,34};
        int[] negValArr = new int[]{-10,-20,-22,-13,-6,-71,-34};
        int[] mixValArr = new int[]{34,-74,55,-43,91,-29,12,70};
        int[] minValOnFirst = new int[]{10,20,30,40,50};
        int[] minValOnLast = new int[]{50,40,30,20,10};
        int[] oneEleArr = new int[]{91};
        int[] noEleArr = new int[]{};

        int[] [] arrays = {posValArr,negValArr,mixValArr,minValOnFirst,minValOnLast,oneEleArr,noEleArr};

        for (int[] arr  : arrays){
            System.out.println("The minimum element in the array of "+Arrays.toString(arr)+" is "+findMinElement(arr));
        }
    }

    public static int findMinElement(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty or blank");
        }
        int minEle = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(minEle > arr[i]){
                minEle = arr[i];
            }
        }
        return minEle;
    }
}
