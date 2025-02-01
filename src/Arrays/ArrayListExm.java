package Arrays;

import java.util.ArrayList;

public class ArrayListExm {

    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // add
        list.add(100);
        list.add(55);
        // set
        list.set(0, 10);
        // get
        int a = list.get(1);

        System.out.println(a);

    }
}
