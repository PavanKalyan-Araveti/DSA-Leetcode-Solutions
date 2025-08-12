package leetCode.top150IQ.QN6ZigZagConversion;

public class Solution {
    public static String convert(String s, int numRows) {
        if(s == null || s.length() == 0) return "";
        if(numRows == 1 || numRows > s.length()) return s;
StringBuilder[] rows = new StringBuilder[numRows];
for(int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
        int currentRow = 0;
        boolean goingDown = true;
        for(char c: s.toCharArray()){
            rows[currentRow].append(c);
            if (currentRow == 0) goingDown = true;
            else if(currentRow == numRows - 1) goingDown = false;
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder ans = new StringBuilder(s.length());
        for(StringBuilder row : rows) ans.append(row);
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 4));
    }
}

/*
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Explanation:
P   A   H   N
A P L S I I G
Y   I   R
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000

 */