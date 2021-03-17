package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,34,4,6,7);

//        list.forEach(s->{
//            System.out.println(s);
//        });
//
//        list.forEach(System.out::println);
        MethodReference methodReference = new MethodReference();
        MyInterfaceMethodRef methodRef = methodReference::display;
        System.out.println(methodRef.msg());

        BiFunction<Integer,Integer,Integer> biFunction = MyInterfaceStatic::add;
        int i = biFunction.apply(1,5);
        System.out.println(i);

    }

    public String display(){
        return "Hello";
    }
}

@FunctionalInterface
interface MyInterfaceMethodRef{

    String msg();
}


interface MyInterfaceStatic{

    public static Integer add(int a,int b){
        return a+b;
    }
}
