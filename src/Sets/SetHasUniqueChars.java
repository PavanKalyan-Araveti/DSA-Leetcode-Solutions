package Sets;

public class SetHasUniqueChars {

public static boolean hasUniqueChars(String str) {
    // using set
//    Set<Character> set = new HashSet<>();
//    for (char c : str.toCharArray()) {
//        if (!set.add(c)) { // add() returns false when c is already present
//            return false;
//        }
//    }
//    return true;

    // using java8
    return str.chars().distinct().count() ==str.length();

}

    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

/*
EXPECTED OUTPUT:
----------------
true
false
true
true
false

*/

    }

}
