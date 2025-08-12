package leetCode.top150IQ.QN242ValidAnagrams;

public class SolutionUsingInt {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] charS = new int[26];
        for(int i = 0; i< s.length(); i++){
            charS[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            charS[s.charAt(i) - 'a']--;
        }

        for(int c: charS) {
            if(c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
