package leetCode.top150IQ.QN14LongestCommonPrefix;

public class VerticalSolution {
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";
        for(int col = 0; col < strs[0].length(); col++){
            char ch = strs[0].charAt(col);
            for(int row = 1; row <strs.length; row++){
                if(col == strs[row].length() || strs[row].charAt(col) != ch){
                    return strs[0].substring(0, col);
                }
            }
        }
        return "";
    }


    public static void main(String[] args) {
        String[] strs = {"ball", "cat", "dog"};
        System.out.println(longestCommonPrefix(strs));
    }
}
