package Test;

import java.util.Scanner;

public class Ternary_Operator_Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println(max + " is the greatest number.");
    }
}

/* Ternary operator is a conditional operator. There is a condition and there are two expressions given.
If a condition is true then the first expression is the answer otherwise the second one. */
