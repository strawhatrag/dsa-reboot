package Arrays;

import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {

        String[] arr = new String[3];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";

        for(String s : arr){
            System.out.print(s);
        }
        System.out.println(); // Add a newline after printing the loop

        System.out.println(Arrays.toString(arr));


    }
}
