package BinarySearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,5},
                {53,55,33},
                {6040,32,33,45,12},
                {93,39}
        };
        int target = 39;

        int[] ans = search2(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target){

        for(int row = 0; row < arr.length; row++ ){
            for(int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int[] search2(int[][] arr, int target){
        int rowIndex = 0;
        for(int[] row: arr ){
            int colIndex = 0;
            for(int colElement: arr[rowIndex]) {
                if (target == colElement) {
                    return new int[]{rowIndex,colIndex};
                }
                colIndex++;
            }
            rowIndex++;
        }
        return new int[] {-1, -1};
    }


}
