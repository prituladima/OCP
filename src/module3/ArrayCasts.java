package module3;

public class ArrayCasts {

    static {
//        if(true) throw new RuntimeException("sdfghjk");
//        java.lang.ExceptionInInitializerError
    }


    public static void main(String[] args) {
        Integer[] numbers = { new Integer(42)};
        Object[] objects = numbers;
//        objects[0] = "forty two";//java.lang.ArrayStoreException
    }

}
