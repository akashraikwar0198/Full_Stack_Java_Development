package inheritance;

public class hybrid
{
    int a, b, c;
}

class chai extends hybrid{
    public void chai1(){
        c = a + b;
        System.out.println(c + " Chai Peelo.");
    }
}

class coffee extends chai{
    public void coffee1(){
        System.out.println(c + " Coffee Peelo.");
    }
}

class neera extends chai{
    public void neera1(){
        System.out.println(c + " Neera Peelo.");
    }
}

class beer extends coffee{
    public void beer1(){
        System.out.println(c + " Beer Peelo.");
    }

    public static void main(String[] args) {
        beer m = new beer();
        m.a=1;
        m.b=2;
        m.chai1();
        m.coffee1();
        m.beer1();
    }
}