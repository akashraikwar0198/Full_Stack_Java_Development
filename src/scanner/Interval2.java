package scanner;

import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        num = scan.nextInt();

        System.out.println("Numbers by interval of 2 are: ");

        for (int i=1;i<=num;i=i+2){
            System.out.println("No. -->" + i);
            }
    }
}
