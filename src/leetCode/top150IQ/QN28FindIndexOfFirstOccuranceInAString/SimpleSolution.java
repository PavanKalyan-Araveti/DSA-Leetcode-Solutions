package leetCode.top150IQ.QN28FindIndexOfFirstOccuranceInAString;

public class SimpleSolution {
public static int strStr(String one, String two){
    return one.indexOf(two);
}

    public static void main(String[] args) {
        String haystack = "ississipissip";
        String needlq = "issip"; // length = 9
        System.out.println(strStr(haystack, needlq));
    }
}
