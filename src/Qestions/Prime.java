package Qestions;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){

//        // edge case is 1 ; 1 not a prime number
//        // 2 and 3 are prime return those numbers as true
//
//        if (n <= 1) return false;
//        if (n <= 3) return true;
//
//        // why square root because after the half-way point were just dividing by twice of the number that came by
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if(n % i == 0) return false;
//        }
//
//        return true;

//        if (n <= 1) return false;
//
//        int i = 2;
//
//        while( i * i <= n){
//
//            if ( n % i == 0) return false;
//
//            i++;
//        }
//
//        return true;

        // edge case 1
        // check for even number directly
        // check factors up to n
        // return true if factor is found; otherwise return false
        if(n <= 1) return false;

        if(n > 2 && n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i+=2){ // skip even numbers
            if(n % i == 0) return true;
        }
        return false;
}}
