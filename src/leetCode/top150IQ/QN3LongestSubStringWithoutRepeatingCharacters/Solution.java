package leetCode.top150IQ.QN3LongestSubStringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
         public static int lengthOfLongestSubString(String s) {
     Map<Character, Integer> lastIndex = new HashMap<>();
     int maxLen = 0;
     int start = 0;
     for (int end = 0; end < s.length(); end++) {
         char c = s.charAt(end);
         if (lastIndex.containsKey(c) && lastIndex.get(c) >= start) {
             start = lastIndex.get(c) + 1;
         }
         lastIndex.put(c, end);
         int currLen = end - start + 1;
         if (currLen > maxLen) {
             maxLen = currLen;
         }
     }
     return maxLen;
 }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));

    }
}


/*
Input: s = "pwwkew"
Output: 3
 */