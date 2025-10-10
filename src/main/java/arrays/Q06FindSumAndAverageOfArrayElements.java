package arrays;

public class Q06FindSumAndAverageOfArrayElements {

    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60,70,80};
        System.out.println("Sum is : "+sumOfEle(arr)+", Average is "+averageOfEle(arr));
        //System.out.println("Average is : "+averageOfEle(arr));
    }

    public static int sumOfEle(int[] arr) {
        ArrayUtils.validateArray(arr);
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static double averageOfEle(int[] arr){
        ArrayUtils.validateArray(arr);
        return (double) sumOfEle(arr)/arr.length;
    }
}
