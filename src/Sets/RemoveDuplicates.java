package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class RemoveDuplicates {

public static List<Integer> removeDuplicates(List<Integer> myList){
    // normal case
//    Set<Integer> set = new HashSet<>();
//    for(int i: myList){
//        set.add(i);
//    }
//    return new ArrayList<>(set);

    // java 8 case
    return new ArrayList<>(new HashSet<>(myList));

}


    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
     //   List<Integer> myList = List.of(5,5,55,6,6,66,7,7,7,7,8,88,8,8,4,3,3,3,2222,1,11111,11111);

        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

/*
EXPECTED OUTPUT:
----------------
[1, 2, 3, 4, 5, 6, 7, 8, 9]

(Order may be different as sets are unordered)
*/

    }

}
