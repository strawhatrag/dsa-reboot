package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2}; // Example rotated sorted array
        int target = 0; // Target element to search

        // Calling the search function and printing the result
        int result = search(arr, target);
        System.out.println("Index of target: " + result);
    }


    static int search(int[] nums, int target) {
        int pivot = findPivot(nums); // Find the index of the pivot (rotation point)

        // If no pivot is found, the array is not rotated, do a normal binary search
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // If target is at the pivot index, return it
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is in the left sorted half, search in that half
        // error last time: target could be equal to start element u forgot that check case
        // always keep in mind of the edge cases like start and end and pivot always
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }

        // Otherwise, search in the right sorted half
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: If mid element is greater than its next element, mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: If mid element is smaller than its previous element, mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: If the mid element is less than or equal to start element, move left
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else { // Otherwise, move right
                start = mid + 1;
            }
        }

        return -1; // No pivot found (array is not rotated)
    }

    static int findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: If mid element is greater than its next element, mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: If mid element is smaller than its previous element, mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Elements in start, mid and end are equal, just skip duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end] ){
                // check if start or end is pivot (edge)
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end;
                }
                end--;
                // skip the duplicate
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // No pivot found (array is not rotated)
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index
            int midVal = arr[mid];

            // If target is found at mid, return index
            if (target == midVal) {
                return mid;
            }

            // If target is greater, search in the right half
            if (target > midVal) {
                start = mid + 1;
            } else { // Otherwise, search in the left half
                end = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
