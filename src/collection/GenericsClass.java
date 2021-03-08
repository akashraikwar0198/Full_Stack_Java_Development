package collection;

public class GenericsClass<T> {

    private T t;

    private void add(T t){
        this.t = t;
    }

    private T get(){
        return t;
    }


    public static void main(String[] args) {

        GenericsClass<Integer> genericsClass = new GenericsClass<>();
        GenericsClass<String> genericsClass1 = new GenericsClass<>();
        genericsClass.add(12);
        genericsClass1.add("String");
        System.out.println(genericsClass.get());
        System.out.println(genericsClass1.get());

    }
}
