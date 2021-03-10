package AnonymousInnerClass;

public class AnonymousInnerClass  {

    public static void main(String[] args) {

        Addition<Integer> addition = new Addition<Integer>() {
            @Override
            Integer add(Integer i, Integer j) {
                return i+j;
            }
        };

        System.out.println(addition.add(9,8));
    }
}

abstract class Addition<T> {

    abstract T add(T i,T j);
}
