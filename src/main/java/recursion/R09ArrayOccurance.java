package recursion;

public class R09ArrayOccurance {
    public static int count(int[] arr, int target, int i) {
        if (i == arr.length)
            return 0;
        if (arr[i] == target)
            return 1 + count(arr,target,i+1);
        else return count(arr,target,i+1);
    }

    public static void main(String[] args) {
        System.out.println(R09ArrayOccurance.count(new int[]{1,2,2,3,4,2,3,5},2,0));
    }
}
