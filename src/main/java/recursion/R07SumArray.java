package recursion;

public class R07SumArray {
    public static void main(String[] args) {
        System.out.println(R07SumArray.sumArray(new int[]{1,2,3,4,5},0));
    }
    public static int sumArray(int[] arr, int i) {
        if (i == arr.length)
            return 0;
        return arr[i] + sumArray(arr, i+1);
    }
}
