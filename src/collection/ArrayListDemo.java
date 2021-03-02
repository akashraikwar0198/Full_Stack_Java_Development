package collection;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.remove(0); //index value to be removed
        list.remove(Integer.valueOf(3));    //specific value to be removed

//        Iterator iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        list.forEach(s -> {
            System.out.println(s);
        });

        /* WE CAN ADD DIFFERENT TYPES INTO A SINGLE ARRAY LIST BUT IT'S A BAD PROGRAMMING ETIQUETTE */
//        List list1 = new ArrayList();
//        list1.add("Akash");
//        list1.add(3);
//        list1.add(2.0);
//        list1.add(12F);
//
//        System.out.println(list1);

        List <Integer> list2 = new LinkedList();        //Linked List implementation. It can save duplicate elements too.
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        System.out.println(list2);


        /* DIFFERENT WAYS TO IMPLEMENT ARRAY LISTS */

        List<Integer> list3 = Arrays.asList(10,20,30,40,50);
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(100,200,300,400,500));
        System.out.println(list4);

        List<Integer> list5 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(list5);

        List<Integer> list6 =
                new ArrayList<>(){{
                    add(11);
                    add(22);
                    add(33);
                    add(44);
                    add(55);
        }};
        System.out.println(list6);

        List<String> list7 = new ArrayList<>();
        list7.add("Akash");
        list7.add("is a");
        list7.add("very");
        list7.add("good");
        list7.add("boy");
        System.out.println(list7);


        list2.addAll(list6);        //merging two Array Lists
        System.out.println(list2);
    }
}
