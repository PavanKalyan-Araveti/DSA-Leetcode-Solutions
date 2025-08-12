package leetCode.top150IQ.QN14LongestCommonPrefix;

import java.util.Arrays;

public class SortingSolution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) == last.charAt(i)) sb.append(first.charAt(i));
            else break;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}






//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//