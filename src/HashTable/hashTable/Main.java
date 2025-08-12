package HashTable.hashTable;

import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i : array1) {
            hashMap.put(i, true);
        }

        for (int j : array2) {
            if (hashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("paint", 842);
        ht.set("bolts", 267);
        ht.set("nails", 465);
        ht.set("tile", 113);
        ht.set("lumber", 753);
        //ht.printTable();
//	System.out.println(ht.get("mahesh"));
//	System.out.println(ht.get("sure"));

        //System.out.println(ht.keys());
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(itemInCommon(array1, array2));
    }
}
