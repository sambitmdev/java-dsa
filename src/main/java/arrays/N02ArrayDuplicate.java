package arrays;

import java.util.HashSet;
import java.util.Set;

public class N02ArrayDuplicate {
    //TC = O(n^2) , SC = O(1)
    public static boolean hasDuplicateBrute(int[] nums) {
        for (int i = 0 ; i < nums.length-1 ; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicateOptimal(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++){
            if(uniqueSet.contains(nums[i])){
                return true;
            }
            uniqueSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(N02ArrayDuplicate.hasDuplicateOptimal(new int[]{1,2,3,4,5,6,6}));
    }
}
