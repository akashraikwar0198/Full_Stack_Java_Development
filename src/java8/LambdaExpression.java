package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> consumer = (i) ->{
            System.out.println(i);

        };
        list.forEach(consumer);


        MyInterface2 myInterface2 = () ->{
            return "Hii";
        };
        System.out.println(myInterface2.msg());


        MyInterface3 myInterface3 = (a,b)->{
            return a+b;
        };

        System.out.println(myInterface3.add(1,9));
    }
}

@FunctionalInterface
interface MyInterface2{
    String msg();
}

@FunctionalInterface
interface MyInterface3{
    Integer add(int i,int j );
}