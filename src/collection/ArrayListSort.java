package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(430);
        list.add(20);
        list.add(340);
        list.add(404);

        Collections.sort(list);

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}