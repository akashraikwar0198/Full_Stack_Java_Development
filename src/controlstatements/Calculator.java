package controlstatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter an arithmetic operation to perform: ");
        char operator = scan.next().charAt(0);

        double result=0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.print("Incorrect Operator.");


        }
        System.out.println(result);

}
}
