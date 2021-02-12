package controlstatements;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        int number, guess, trials=0;

        Scanner scan = new Scanner(System.in);              //user input
        number = (int) (Math.random() * 100 + 1);           //random number generation

        do {
            System.out.println("Enter the number to guess: ");
            guess = scan.nextInt();
            trials++;
            if (guess > number) {
                System.out.println("Number is High.");
            }
            else if (guess < number){
                System.out.println("Number is Low.");
            }
            else {
                System.out.println("You guessed correct in " + trials + " trials");
            }
        }while (guess != number) ;
    }
}
