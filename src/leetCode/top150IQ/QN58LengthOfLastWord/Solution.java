package leetCode.top150IQ.QN58LengthOfLastWord;

public class Solution {
        public static int lengthOfLastWord(String s) {
            String result = s.trim();
            int count = 0;
            for(int i = result.length() - 1; i >= 0; i--){
                if(result.charAt(i) == ' ') break;
                count++;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    }


    /*
    Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
     */