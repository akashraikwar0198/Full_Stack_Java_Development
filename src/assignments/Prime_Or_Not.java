package assignments;

import java.util.Scanner;

public class Prime_Or_Not {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)          //condition for getting the factors of number n
                count = count + 1;
        }

        if (count == 2)                //if factors are two then, number is prime else not
            System.out.println("Prime Number.");
        else
            System.out.println("Not a Prime Number.");
    }
}
