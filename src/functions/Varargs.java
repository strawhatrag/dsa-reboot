package functions;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {

        fun(1,4,3,4);

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
