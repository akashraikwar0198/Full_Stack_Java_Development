package controlstatements;

public class ForLoop {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){                     //traditional for loop
            System.out.println("Hello Pune.");
        }


        int i=0;
        int arr[] = {10, 20, 30, 40, 50};

        for (int j=0; j< arr.length; j++){          //traditional for loop
            System.out.println(arr[j]);
        }


        for (int k:arr){                            //enhanced for loop, just used for arrays (Java 8)
           System.out.println(k);
        }
    }
}
