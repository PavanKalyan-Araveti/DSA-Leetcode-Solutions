package leetCode.top150IQ.QN128LongestConsecutiveSequence;

import java.util.Arrays;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int finalCount = 1;// 1 2 3 4 100 200
        int currentCount = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) continue;
            else if(nums[i] == nums[i - 1] + 1) {
                currentCount++;
            }
            else{
                finalCount = Math.max(finalCount, currentCount);
                currentCount = 1;
            }
        }
        return Math.max(finalCount, currentCount);
    }

    public static void main(String[] args) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
}
