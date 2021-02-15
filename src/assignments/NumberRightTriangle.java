package assignments;

public class NumberRightTriangle {

    public static void main(String[] args) {

        int i, j, k=0;

        for (i=1;i<=5;i++){

            for(j=1;j<=i;j++){
                k++;
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
