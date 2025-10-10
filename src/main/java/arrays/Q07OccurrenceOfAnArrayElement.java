package arrays;

public class Q07OccurrenceOfAnArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,12,35,45,55,70,10,43,90,70,30,40,40,50,22,10,87};
        System.out.println("The given number appeared "+ countOccurrence(arr,10)+" times in the array.");
    }

    public static int countOccurrence(int[] arr, int target){
        ArrayUtils.validateArray(arr);
        int count = 0;
        for (int num : arr){
            if (num == target){
                count++;
            }
        }
        return count;
    }
}

