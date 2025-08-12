package leetCode.top150IQ.QN383RansomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
            for(char ch: magazine.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
         for(char ch: ransomNote.toCharArray()){
             if(map.containsKey(ch)){
                 if(map.get(ch) > 1){
                     map.put(ch, map.get(ch) - 1);
                 }
                 else map.remove(ch);
             }
             else{
                 return false;
             }
         }
         return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
