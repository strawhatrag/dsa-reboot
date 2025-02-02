package BinarySearch;

public class splitArrayLargestSum {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int k) {

        // ok bro , we are going create a range of ans ex: [7,2,5,10,8]
        // when k = 1, the output will be 32 sum of all nums
        // when k = 5, the output will be 10, largest num

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // starting range [10 , 32], start = 10, end = 32

        while (start < end){
            int mid = start + (end - start) / 2;

            if(canSplit(nums, k, mid)){
                end = mid; // try for smaller max value
            }else{
                start = mid + 1; // need a larger max value
            }


        }

        return start;


    }

    boolean canSplit(int[] nums, int k, int mid){
        int subArrayCount = 1;
        int currentSum = 0;

        for (int num : nums){
            //if we exceed mid
            if(currentSum + num > mid){
                // increase subarray and reset the count
                subArrayCount++;
                currentSum = num;
                if (subArrayCount > k) return false;
            }else{
                currentSum += num;
            }
        }
        return true;

    }
}

