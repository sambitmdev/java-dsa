package arrays;

public class Q09SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[] {10,20,22,19,25,90,72,76,81,90,23};
        System.out.println("Second Largest Element is : "+secondLargestEle(arr));
    }

    public static int secondLargestEle(int[] arr){
        ArrayUtils.validateArray(arr);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num < largest && num > secondLargest){
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No distinct second largest number");
        }
        return secondLargest;
    }
}
