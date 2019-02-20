package module1;

public class Overloading {

    public static void main(String[] args) {

//        Converting to twoArgs larger primitive type
//        Converting to an autoboxed type
        a(new Double(5), new Double(5));
        a(new Double(5), 5);
        a(5, 5);
        a(5.0, 5);
        a(5L, 5);
        a(5L, 5.0);
        a(new Long(5), new Double(5));
        a(new Integer(5), new Long(5));
        a(new Long(5), new Long(5));
        a(new Double(5), new Double(5));
        a(new Integer(5), new Integer(5));

    }

    private static void a(int a, int b) {
        System.out.println("int");
    }

    private static void a(double a, double b) {
        System.out.println("double");
    }

    private static void a(Integer a, Integer b) {
        System.out.println("Integer");
    }

    private static void a(Double a, Double b) {
        System.out.println("Double");
    }

    private static void a(long a, long b) {
        System.out.println("long");
    }

    private static void a(Long a, Long b) {
        System.out.println("long");
    }

}
