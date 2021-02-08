package inheritance;

class uno {
    int x, y, z;

    public void method1(){
        System.out.println("This is Method1.");
    }
}

class duos extends uno{
    public void method2(){
        System.out.println("This is Method2.");
    }
}

class tres extends uno{
    public void method3(){
        System.out.println("This is Method3.");
    }

    public static void main(String[] args) {
        tres t = new tres();
        t.method1();
        t.method3();
    }
}