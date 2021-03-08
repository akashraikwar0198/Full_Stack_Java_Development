package collection;

import java.util.ArrayList;
import java.util.List;

public class Generics {


    public static void main(String[] args) {

//
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//
//
//        Integer i =(Integer) list.get(0);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        show(list);

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        show(strings);

    }

    private static void show(List<?> list) {

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}