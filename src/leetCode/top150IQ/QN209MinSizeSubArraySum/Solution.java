package leetCode.top150IQ.QN209MinSizeSubArraySum;

public class Solution {
    public static int minSubArrayLen(int target, int[] nums){
        int left = 0, sum = 0, best = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                best = Math.min(best, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}

/*
left = 0
sum = 0
best = ∞

for right in 0 .. n-1:
  sum += nums[right]

  # now try to shrink from the left as much as possible
  while sum >= target:
    best = min(best, right - left + 1)
    sum  = sum - nums[left]
    left++

return (best == ∞ ? 0 : best)
 */