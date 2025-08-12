package HashTable.Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicate {

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (hashMap.get(i) == null) {
                hashMap.put(i, true);
            } else {
                hashMap.put(i, false);
            }
        }
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) == false) {
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 2, 1, 2, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}
