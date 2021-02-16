package exceptionhandling;

public class NestedTry {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            try {
                int k = i / j;
            } catch(ArithmeticException e){
                System.out.println("Arithmetic Exception -> " + e);
            }

            String s = null;
            System.out.println(s.length());

            String s1 = "S";
            int l = Integer.parseInt(s1);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic -> " + e);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer -> " + e);
        } catch (Exception e) {
            System.out.println("parent Exception -> " + e);
        } finally {
            System.out.println("Finally Printed.");
        }
    }
}
