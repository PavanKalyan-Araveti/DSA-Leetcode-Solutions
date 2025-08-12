package leetCode.top150IQ.QN1TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int partner = target - nums[i];
            if(map.containsKey(partner)){
                return new int[]{map.get(partner), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 3, 6};
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
