package HashTable.Practise;


import java.util.HashMap;
import java.util.Map;

public class FindFirstChar {

    public static Character firstNonRepeatingChar(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> Map = new HashMap<>();
        for (char i : ch) {
            Map.put(i, Map.getOrDefault(i, 0) + 1);
        }
        char c;
        for (char i : ch) {
            if (Map.get(i) == 1) {
                c = i;
                return c;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}