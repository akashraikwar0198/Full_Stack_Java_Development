package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Iterator iterator = list.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
