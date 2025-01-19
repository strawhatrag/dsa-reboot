package intro;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
}

    public static class Fib {
        public static void main(String[] args) {
            int n = new Scanner(System.in).nextInt();
            int a = 0, b = 1, count = 2;
            while (count++ <= n) {
                b += a;
                a = b - a;
            }
            System.out.println(b);
        }
    }

    public static class Conditions {

        public static void main(String[] args) {

            int salary = 20000;

            if (salary <= 10000){
                salary = salary + 2000;
            } else if (salary <= 20000){
                salary =  salary + 4000;
            }

            System.out.println(salary);
        }

    }

    public static class Largest {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);


            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

           int max = Math.max(c, Math.max(a, b));
            System.out.println(max);
        }
    }

    public static class Loops {

        public static void main(String[] args) {
            /*
            for(initialisation; condition; increment/decrement){
                //body
            }
            */

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

    //        for(int num= 1; num <= n; num++){
    //            System.out.println(num);
    //        }




            do {
                System.out.println("Print this once anyways");
            }while (n++ < 1);



        }
    }

    public static class Main {
        public static void main(String[] args) {

            int rollno = 64;
            //string is not primitive
            String name = "rag";
            System.out.println(rollno);
        }
    }

    public static class Occurrence {

        public static void main(String[] args) {
            int n = 12335;
            int count = 0;
            while (n > 0){
                int rem = n % 10;
                if (rem == 3){
                    count++;
                }

                n = n/10;  // this is int so decimal is ignored
            }

            System.out.println(count);
        }
    }

    public static class Reverse {

        public static void main(String[] args) {

            int n = 23597;

            int result = 0;

            while (n > 0){

                int rem = n % 10;

                result = result * 10 + rem;

                n = n / 10;
            }

            System.out.println(result);

        }
    }

    public static class sum {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int num1 = input.nextInt();
            float num2 = input.nextInt();

            System.out.println(num1 + num2);
        }
    }

    public static class Switch {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String fruit = in.next();
            switch (fruit){
                case "Mango" -> System.out.println("mango");
                case "Apple" -> System.out.println("keeps the doctor away");
                default -> System.out.println("meh fruit");
            }


        }
    }
}