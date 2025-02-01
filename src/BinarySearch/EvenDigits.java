package BinarySearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {555,9011,482,1771};

        System.out.println(totaleven(nums));
    }

    // find number of digits of each element
    // check if it's divisible by 2
    // add to output if true else ignore

    static int totaleven(int[] arr){
        int output = 0;
        for(int num : arr){
            int count = totalCount(num);
            if(count % 2 == 0){
                output++;
            }
        }
        return output;
    }


    static int totalCount(int a){
        int count= 0;

        while (a > 0){
            a /= 10;
            count++;
        }
        return count;
    }
}
