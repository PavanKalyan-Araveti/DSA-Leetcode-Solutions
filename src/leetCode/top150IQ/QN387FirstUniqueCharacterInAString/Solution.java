package leetCode.top150IQ.QN387FirstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }

    // better
    /*
    public static int firstUniqChar(String s){
        int[] count = new int[26];
        for(char c: s.toCharArray()){
            count[c - 'a']++;
        }
        int i = 0;
        for(char c: s.toCharArray()){
            if(count[c - 'a'] == 1) return i;
            i++;
        }
        return -1;
    }

     */

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
