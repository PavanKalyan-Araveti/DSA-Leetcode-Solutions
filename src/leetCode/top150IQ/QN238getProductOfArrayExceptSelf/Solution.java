package leetCode.top150IQ.QN238getProductOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {
    /*
    //brute foce
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int multiply = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;
                multiply *= nums[j];
            }
            answer[i] = multiply;
        }
        return answer;
    }

     */

    public static int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = nums.length -1; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}


/*
Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */