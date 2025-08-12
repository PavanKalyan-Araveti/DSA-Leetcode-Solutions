package leetCode.top150IQ.QN28FindIndexOfFirstOccuranceInAString;

public class MySolution {
    public static int strStr(String haystack, String needle) {
        if(haystack.startsWith(needle)) return 0;
        int count = 1;
        while(haystack.length() > 0){
            haystack = haystack.substring(1);
            if(haystack.startsWith(needle)) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "ississipissip";
        String needlq = "issip"; // length = 9
        System.out.println(strStr(haystack, needlq));
    }
    }




/*
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */