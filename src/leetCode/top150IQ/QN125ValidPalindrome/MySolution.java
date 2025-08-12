package leetCode.top150IQ.QN125ValidPalindrome;

public class MySolution {
    public static boolean isPalindrome(String s){
        if(s.length() == 0) return true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if(!(s.charAt(i) == s.charAt(j))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
