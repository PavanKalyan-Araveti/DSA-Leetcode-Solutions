package leetCode.top150IQ.QN125ValidPalindrome;

public class EfficientSolution {
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="race a car";
        System.out.println(isPalindrome(str));
    }
}
