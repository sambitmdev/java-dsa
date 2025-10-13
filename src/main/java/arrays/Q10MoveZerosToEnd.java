package arrays;

public class Q10MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{12,0,24,25,29,122,0,34,54,68,98,0};
        ArrayUtils.printArray(arr);
        moveZeros(arr);
        ArrayUtils.printArray(arr);
    }

    public static void moveZeros(int[] arr){
        int j = 0;

        for (int i = 0 ;  i < arr.length ; i++){
            if (arr[i] != 0){
                if (i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
