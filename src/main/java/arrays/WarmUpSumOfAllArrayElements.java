package arrays;

public class WarmUpSumOfAllArrayElements {
    public static void main(String[] args) {
        int sum = sum( new int[]{10,22,35,49,51});
        System.out.println("Sum is " + sum );
    }
    public static int sum(int[] integerArray){
        int sum = 0;
        for (int j : integerArray) {
            sum += j;
        }
        return sum;
    }
}
