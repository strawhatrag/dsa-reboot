package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 10, 15};
        int[] arr2 = {15, 10, 5, 4, 3, 2, 0, -4, -12, -18};
        int target = -12;
        int ans = binarySearch(arr2, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start < end){
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
