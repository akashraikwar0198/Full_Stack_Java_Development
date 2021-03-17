package Test;

import java.util.Arrays;
import java.util.List;

public class LongestWord {

    public static void main(String[] args) {

        int longest = 0;
        String str1 = "";

        List<String> list = Arrays.asList("Akash", "Rajesh", "Raikwar");

        for (String str : list) {
            if (str.length() > longest) {
                longest = str.length();
                str1 = str;
            }
        }
        System.out.println(str1);

    }
}
