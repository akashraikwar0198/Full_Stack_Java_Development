package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"String1");
        map.put(2,"String2");

        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }


//        map.forEach((k,v)->{
//            System.out.println(k+" "+v);
//        });
    }
}