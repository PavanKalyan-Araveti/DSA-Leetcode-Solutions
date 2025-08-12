package leetCode.top150IQ.QN242ValidAnagrams;

import java.util.HashMap;
import java.util.Map;

public class SolutionUsingHashMap {
    public static boolean isAnagram(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+ 1);

        for(char c : t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
