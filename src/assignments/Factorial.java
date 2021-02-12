package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");

        int num = scanner.nextInt();

        for (int i = 1; i<=num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is : " + factorial);
    }
}
