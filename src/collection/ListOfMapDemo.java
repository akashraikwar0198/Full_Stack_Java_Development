package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapDemo {

    public static void main(String[] args) {

        List<Map<Integer, String>> list = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "String");
        map.put(2, "String2");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "String3");
        map1.put(2, "String4");

        list.add(map);
        list.add(map1);


        list.forEach(s -> {
            s.forEach((k, v) -> {
                System.out.println(k + " " + v);
            });
        });
    }
}