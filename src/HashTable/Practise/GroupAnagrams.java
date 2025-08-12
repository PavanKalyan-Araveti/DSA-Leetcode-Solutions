package HashTable.Practise;

import java.util.*;


public class GroupAnagrams {

public static List<List<String>> groupAnagrams(String[] strings) {
    Map<String, List<String>> anagramGroups = new HashMap<>(); // WRITE GROUPANAGRAMS METHOD HERE //
    for(String string: strings){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String canonical = new String(chars);
        /* // this checks manually like exist or not
        List<String> group;
        if(anagramGroups.containsKey(canonical)){
            group = anagramGroups.get(canonical);
        }else{
            group = new ArrayList<>();
            anagramGroups.put(canonical, group);
        }
        group.add(canonical);

         */
        // lambda checks automatic
        anagramGroups.computeIfAbsent(canonical, k -> new ArrayList<>()).add(string);
    }
return new ArrayList<>(anagramGroups.values());
}

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

/*
EXPECTED OUTPUT:
----------------
1st set:
[[eat, tea, ate], [tan, nat], [bat]]

2nd set:
[[abc, cba, bac], [foo], [bar]]

3rd set:
[[listen, silent], [triangle, integral], [garden, ranged]]

*/

    }

}