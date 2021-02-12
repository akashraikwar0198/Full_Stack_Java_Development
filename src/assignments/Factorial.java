package assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, factorial=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");

        num = scanner.nextInt();

        for (int i=1; i<=num; i++) {
            factorial = factorial * num;
        }
        System.out.println("Factorial of " + num + " is : " + factorial);
    }
}
