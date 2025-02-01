package BinarySearch;

public class CeliingOfnum {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 10, 15};
//        int[] arr2 = {15, 10, 5, 4, 3, 2, 0, -4, -12, -18};
        int target = -19;
        int ans = CellingSearch(arr, target);
        System.out.println(ans);

    }

    static int CellingSearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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
        // because start is not start at end we store it as start + 1 and end similarly end - 1
        //return arr[end + 1];

        return arr[start];

    }
}
