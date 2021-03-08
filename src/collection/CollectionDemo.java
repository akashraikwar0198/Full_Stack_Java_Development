package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {


        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=0;i<=100;i++){
            System.out.println(arr[i]);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
    }
}
