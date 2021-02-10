package controlstatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int i=0;
        if (i>0){                                               //simple if-else loop
            System.out.println("i is positive.");
        }
        else {
            System.out.println("i is zero or negative.");
        }


        int a=10, b=20, c=30;
        if(a>b && a>c){                                     //if else loop (multiple conditions.)
            System.out.println("a is greater.");
        }
        else if(b>c){
            System.out.println("b is greater.");
        }
        else{
            System.out.println("c is greater.");
        }


        int age=19;
        String nationality = "Indian";

        if(age>18){                                     //nested if-else loop
            if(nationality=="Indian"){
                System.out.println("You can Vote.");
            }
            else{
                System.out.println("Not Indian.");
            }
        }
        else{
            System.out.println("You cannot Vote.");
        }
    }
}
