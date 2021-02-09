package polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {


        SBI sbi = new SBI();
        sbi.interest(11);
        sbi.minimumBalance();

        HDFC hdfc = new HDFC();
        hdfc.interest(13);
        hdfc.minimumBalance();

        Bank bank = new Bank();
        bank.interest(10);
    }
}

class Bank {


    public void interest(int i){
        System.out.println("default interest is "+i);
    }

    public void minimumBalance(){
        System.out.println("100 rs required");
    }

}

class SBI extends Bank{
    public void interest(int i){
        System.out.println("sbi interest is "+i);
    }
}

class HDFC extends Bank {
    public void interest(int i){
        System.out.println("HDFC interest is "+i);
    }
}