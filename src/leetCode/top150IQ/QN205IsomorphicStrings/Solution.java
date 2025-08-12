package leetCode.top150IQ.QN205IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        if(s == null && t == null) return true;
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(mapS.containsKey(chS)){
                if(mapS.get(chS) != chT) return false;
            }
            mapS.put(chS, chT);
            if(mapT.containsKey(chT)){
                if(mapT.get(chT) != chS) return false;
            }
            mapT.put(chT, chS);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}

/*
Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true
 */
