package arrays;

public class Q03IsArraySorted {
    public static void main(String[] args) {
        boolean status = isSorted(new int[]{2,4,6,8,10});
        System.out.println(status);
    }

    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
