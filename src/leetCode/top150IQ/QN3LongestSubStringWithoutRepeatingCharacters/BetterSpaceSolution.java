package leetCode.top150IQ.QN3LongestSubStringWithoutRepeatingCharacters;

import java.util.Arrays;

public class BetterSpaceSolution {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[26];
        Arrays.fill(last, -1);
        int maxLen = 0, start = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (last[index] >= start) {
                start = last[index] + 1;
            }
            maxLen = Math.max(maxLen, i - start + 1);
            last[index] = i;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
