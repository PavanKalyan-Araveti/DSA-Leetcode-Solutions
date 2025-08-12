package leetCode.top150IQ.QN28FindIndexOfFirstOccuranceInAString;

public class NormalSolution {
    public static int strStr(String haystack, String needle){
        int h = haystack.length(), n = needle.length();
        if(n > h) return -1;
        for(int i = 0; i <= h - n; i++){
            int j = 0;
            while(j < n && haystack.charAt(i + j) == needle.charAt(j)) j++;
            if(j == n) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        String haystack = "ississipissip";
        String needlq = "issip"; // length = 9
        System.out.println(strStr(haystack, needlq));
    }
}
