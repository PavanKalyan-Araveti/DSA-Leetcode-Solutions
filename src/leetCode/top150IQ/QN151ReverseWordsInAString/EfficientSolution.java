package leetCode.top150IQ.QN151ReverseWordsInAString;

public class EfficientSolution {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int end = n - 1;
        while(end >= 0){
            while(end >= 0 && s.charAt(end) == ' ') end--;
            if(end < 0) break;
            int start = end;
            while(start >= 0 && s.charAt(start) != ' ') start--;
            sb.append(s, start + 1, end + 1).append(' ');
            end = start - 1;
        }
       if(sb.length() > 0) sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " I Love   India";
        System.out.println(reverseWords(str));
        System.out.println(str);
    }
}
