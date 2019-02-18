package module1;

public class InnerClazz {

    private int length = 5;

    public void calculate() {
        final int width = 20;
//        width = 50;//compile error
        length = 50;//compile ok
        class Inner {
//            public static void p (){}//will not compile

            public void multiply() {
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        InnerClazz outer = new InnerClazz();
        outer.calculate();

        Comparable<Integer> comparable = new Comparable<Integer>() {
//            public static void p (){}//will not compile

            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };

    }
}
