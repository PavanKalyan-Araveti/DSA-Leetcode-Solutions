package Sets;

import java.util.*;

public class FindPairs {

    public static List<int[]> findPairs(int[] array1, int[] array2, int target){
        //using set if arrays are unsorted it will be efficient
//        Set<Integer> lookUp = new HashSet<>();
//        List<int[]> pairs = new ArrayList<>();
//        for(int i: array2) {
//            lookUp.add(i);
//        }
//        for(int a : array1){
//            int b = target - a;
//            if(lookUp.contains(b)){
//                 pairs.add(new int[]{a, b});
//            }
//        }
//        return pairs;

        //pointers method when arrays are sorted it will be efficient
        Arrays.sort(array1);
        Arrays.sort(array2);
        List<int[]> pairs = new ArrayList<>();
        int i = 0;
        int j = array2.length - 1;
        while(i < array1.length && j >= 0){
            int sum = array1[i] + array2[j];
            if(sum == target){
                pairs.add(new int[]{array1[i] , array2[j]});
                i++;
                j--;
            }
            else if(sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return pairs;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

/*
EXPECTED OUTPUT:
----------------
[5, 2]
[3, 4]
[1, 6]

*/

    }

}
