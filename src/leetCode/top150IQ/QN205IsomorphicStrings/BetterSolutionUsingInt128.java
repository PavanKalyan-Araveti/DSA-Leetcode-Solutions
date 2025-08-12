package leetCode.top150IQ.QN205IsomorphicStrings;

import java.util.Arrays;

public class BetterSolutionUsingInt128 {
    public static boolean isIsomorphic(String s, String t){
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        Arrays.fill(mapS, -1);
        Arrays.fill(mapT, -1);
        for(int i = 0; i < s.length(); i++){
            int chS = s.charAt(i);
            int chT = t.charAt(i);
            if(mapS[chS] != mapT[chT]) return false;
            mapS[chS] = i;
            mapT[chT] = i;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babc", t = "baba";
        System.out.println(isIsomorphic(s, t));
    }
}
