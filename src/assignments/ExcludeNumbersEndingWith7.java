package assignments;

public class ExcludeNumbersEndingWith7 {

    public static void main(String[] args) {
        int num ;

        System.out.println("From 100 to 200 excluding numbers ending with 7 are: ");

        for (num = 100 ; num <= 200 ; num++ ) {
            if (num % 10 != 7) {
                System.out.println(num);
            }
        }
    }
}
