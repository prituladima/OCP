package module1.review1;

public class Outer2 {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer2.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer2().getX();
    }
}
