package string;

public class StringDemo {

    public static void main(String[] args) {

        String s = "abc";
        String s1 = "abc";

        s.concat("cde");
        String s2  = new String("abc");
        String s3  = new String("abc");

        System.out.println(s3==s2);
        System.out.println(s3.equals(s2));

        StringBuffer stringBuffer = new StringBuffer("abc");//synchronized
        stringBuffer.append("cde");

        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("abc");//non-synchronized
        stringBuilder.append("ecf");
    }
}
