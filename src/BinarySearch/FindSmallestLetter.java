package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetter {

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));

    }

    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
        }


        return arr[start];
    }
}
