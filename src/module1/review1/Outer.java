package module1.review1;

public class Outer {
    private int x = 5;

    protected class Inner {
//        public static int x = 10;//Inner class can not have twoArgs static members without exception


        public void go() {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.go();
    }
}