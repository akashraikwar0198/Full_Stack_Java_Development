package assignments;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        int num;

        System.out.println("Enter a number to print the table : ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(num + "*" + i + " --> " + (num*i));
    }
}
