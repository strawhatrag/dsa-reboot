import java.util.Scanner;

public class Switch {
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
