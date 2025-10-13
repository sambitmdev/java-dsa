package arrays;

public class Q08IndexOfLargestElement {

    public static void main(String[] args) {
        int[] arr = new int[] {50,10,20,30,40,60};
        System.out.println("Index of Largest Element is : "+findIndex(arr));
    }

    public static int findIndex(int[] arr){
        ArrayUtils.validateArray(arr);
        int biggest =  arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > biggest) {
                biggest = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
