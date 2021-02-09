package abstraction.abstractdemo;

public abstract class RBI {
    public abstract void interest();
    public void rule(){
        System.out.println("Minimum 100 INR is needed.");
    }
}

class SBI extends RBI {
    public void interest(){
        System.out.println("SBI Rate of Interest is 10%");
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interest();
        sbi.rule();
    }
}

class HDFC extends RBI{
    public void interest(){
        System.out.println("HDFC Rate of Interest is 10%");
    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.interest();
        hdfc.rule();
    }
}

class Kotak extends RBI{
    public void interest(){
        System.out.println("Kotak Rate of Interest is 10%");
    }

    public static void main(String[] args) {
        Kotak kotak = new Kotak();
        kotak.interest();
    }
}

