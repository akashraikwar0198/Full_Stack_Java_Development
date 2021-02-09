package polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading polymorphism = new MethodOverloading();
        System.out.println(polymorphism.add(1.8f,10));
//        System.out.println(polymorphism.add(1,8,9));
    }

    public float add(float i, int j){
        return i+j;
    }


    public float add(float i, int j, int k){
        return i+j;
    }

}


