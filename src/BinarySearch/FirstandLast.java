package BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstandLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if (ans[0]== -1) return ans;

        if(ans[0] != -1 ) {
            ans[1]  = search(nums, target, false);};

        return ans;
    }

    static int search(int[] nums, int target, boolean findStart){
        int left = 0, right = nums.length - 1, ans = -1;


        while(left <= right ){
            int mid = left + (right - left)/ 2;

            if(nums[mid] == target){
                ans = mid;
                if(findStart){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return ans;
    }
}
