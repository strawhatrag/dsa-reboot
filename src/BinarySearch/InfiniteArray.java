package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165};
//        int[] arr2 = {15, 10, 5, 4, 3, 2, 0, -4, -12, -18};
        int target = 105;

        System.out.println(searchInRange(arr, target));

    }
    static int  searchInRange(int[] arr, int target){
        // this function will check if the target lies in the basket
        // the basket grows exponentially until the target is found
        // once target is found we apply binary serach , since this is an infinite array
        // we do not need to worry about going out of bound

        int start = 0;
        int end = 1;  // 1 to n

        while ( target > arr[end]){
            int temp = end + 1; // later assigned to start

            end = end + (end - start + 1); // plus one to account for indexing 0
            start = temp;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            } else{
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
