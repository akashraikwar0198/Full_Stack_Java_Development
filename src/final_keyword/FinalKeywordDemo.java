package final_keyword;

public final class FinalKeywordDemo {

    final int i = 10;

    public static void main(String[] args) {
        FinalKeywordDemo dem = new FinalKeywordDemo();
//        dem.i = 18;

        dem.show();
    }

    public final void show() {
        System.out.println(i);
    }
}


//class FinalKeywordDemo1 extends FinalKeywordDemo{

//    public void show() {
//        System.out.println(i);
//    }

//}