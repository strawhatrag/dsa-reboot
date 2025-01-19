public class Conditions {

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
