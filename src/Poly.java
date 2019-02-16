import java.io.FileNotFoundException;
import java.io.IOException;

public class Poly {

    private static class A {
        String a = "AAAAAA";
        Object a(Object b) throws NullPointerException, IOException {
            System.out.println(a);
            return null;
        }
    }

    private static class B extends A {
        String a = "BBBBBB";
        @Override
        String a(Object b) throws FileNotFoundException {
            System.out.println(a);
            return "-";
        }
    }

    public static void main(String[] args) throws Exception {
        A a = new B();
        a.a(null);
    }

}
