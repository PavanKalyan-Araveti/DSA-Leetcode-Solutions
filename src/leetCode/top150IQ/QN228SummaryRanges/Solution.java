package leetCode.top150IQ.QN228SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int start = nums[0];
        Integer end = null;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) end = nums[i];
            else {
                if (end != null) {
                    list.add(start + "->" + end);
                    end = null;
                } else
                    list.add(String.valueOf(start));
                start = nums[i];
            }
        }
        if (end != null) list.add(start + "->" + end);
        else list.add(String.valueOf(start));
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> output = summaryRanges(nums);
        System.out.println(output.toString());
    }
}
