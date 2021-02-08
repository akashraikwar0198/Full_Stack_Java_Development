package inheritance;

class first {
    int x, y, z;
}

class Addition extends first{
    public void add() { z = x + y; }
}

class Subtraction extends Addition {
    public void sub() {
        z = x - y;
    }
}

class Multiplication extends Subtraction {
    public void mul(){
        z = x * y;
    }
}

class Division extends Multiplication {
    public void div(){
        z = x / y;
    }
}

class Modulus extends Division {
    public void mod(){
        z = x % y;
    }

    public static void main(String[] args) {
        Modulus mod = new Modulus();
        mod.x=15;
        mod.y=5;

        mod.add();
        System.out.println("Addition is " + mod.z);

        mod.sub();
        System.out.println("Subtraction is " + mod.z);

        mod.mul();
        System.out.println("Multiplication is " + mod.z);

        mod.div();
        System.out.println("Division is " + mod.z);

        mod.mod();
        System.out.println("Modulus is " + mod.z);
    }
}
