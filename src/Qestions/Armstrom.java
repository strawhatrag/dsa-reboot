package Qestions;

import java.util.Scanner;

public class Armstrom {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isArm(num));
    }

    // n % 10 will give last digit
    // add it to result
    //
    static boolean isArm(int n) {
        int originalVal = n;
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            result += rem * rem * rem;
        }

        return result  == originalVal;
    }
}
