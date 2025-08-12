package leetCode.top150IQ.QN242ValidAnagrams;

import java.util.Arrays;

public class SolutionUsingSort {
    public static boolean isAnagram(String s, String t) {
         char[] character = s.toCharArray();
         Arrays.sort(character);
         String s1 = new String(character);
         char[] charArray = t.toCharArray();
         Arrays.sort(charArray);
         String s2 = new String(charArray);
         if(s1.equals(s2)) return true;
         return false;
     }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
