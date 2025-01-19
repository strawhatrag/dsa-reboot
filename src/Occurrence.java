public class Occurrence {

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
