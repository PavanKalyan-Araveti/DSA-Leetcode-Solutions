package leetCode.top150IQ.QN151ReverseWordsInAString;

public class Solution {
    public static String reverseWords(String s) {
       // String result = String.join(" ", s.trim().split("\\s+"));
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " I Love   India";
        System.out.println(reverseWords(str));
        System.out.println(str);
    }
}
