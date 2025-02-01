package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/


class HardMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = findInMountainArray(target, arr);
        System.out.println("Target found at index: " + result);
    }

    public static int findInMountainArray(int target, int[] arr) {
        // find peak
        // run binary in asc then des if element not found
        // return -1 if non found
        int peak = peakElement(arr);

        // search in asc array
        int searchLeft = orderAgnosticBinarySearch(arr, 0, peak, target, true);
        if (searchLeft != -1) {
            return searchLeft;
        }

        // search in desc array
        return orderAgnosticBinarySearch(arr, peak + 1, arr.length - 1, target, false);
    }

    static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target, boolean isAsc) {
        // big error here
        // If we use while (start <= end), the loop runs until start and end are equal, ensuring the last element is checked.
        // If we use while (start < end), the loop exits one step too early, potentially skipping the last element.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr[mid];

            if (target == midVal) {
                return mid;
            }

            if (isAsc) {
                if (target > midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakElement(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        // if such peak element exists the start and end will point to it in the end
        return start;
    }
}





