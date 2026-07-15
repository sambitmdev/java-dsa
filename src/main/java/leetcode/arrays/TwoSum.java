package leetcode.arrays;

import java.util.Arrays;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target){

        for(int i = 0 ; i < nums.length-1; i++){
            int temp = target - nums[i];
            for (int j = i+1;j<nums.length;j++){
                if (nums[j] == temp){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution Found");
    }
    //TC = O(n2)
    //SC = O(1)
    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        int[] a = {2,7,11,15};
        int[] ints = twoSum1.twoSum(a, 18);
        System.out.println(Arrays.toString(ints));
    }
}
