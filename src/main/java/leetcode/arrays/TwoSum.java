package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSumBrute(int[] nums, int target){

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

    public int[] twoSumOptimised(int[] nums, int target){
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int temp = target - nums[i];
            if (indexMap.containsKey(temp)){
                return new int[]{i, indexMap.get(temp)};
            }
            indexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution Found");
    }
    //TC = O(n)
    //SC = O(n)
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] a = {2,7,11,15};
        int[] ints = twoSum.twoSumOptimised(a, 18);
        System.out.println(Arrays.toString(ints));
    }
}
