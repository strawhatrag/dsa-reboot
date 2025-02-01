package BinarySearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "srirag";

        char target = 't';

        System.out.println(find(name, target));
    }


    static boolean find(String str, char target) {

//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) return true;
//        }

        for (char c: str.toCharArray()){
            if ( c == target) return true;
        }

        return false;
    }
}
