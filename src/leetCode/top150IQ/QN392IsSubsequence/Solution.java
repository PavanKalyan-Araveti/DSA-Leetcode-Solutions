package leetCode.top150IQ.QN392IsSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isSubsequence(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for(char c: t.toCharArray()){
            map.put(c, i++);
        }
        int prev = -1;
        for(char c: s.toCharArray()){
            Integer current = map.get(c);
            if(current == null) return false;
            if(current < prev) return false;
            prev = current;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahcgdx";
        System.out.println(isSubsequence(s, t));
    }
}



/*
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */