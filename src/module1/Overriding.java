package module1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Comparator;

public class Overriding {

    private static class A implements Comparable<A> {
        Object a(Object a) throws NullPointerException, IOException{
            return null;
        }

        @Override
        public int compareTo(A o) {
            return 0;
        }
    }

    private static class B extends A{
        @Override
        String a(Object a) throws FileNotFoundException {
            return "-";
        }
    }

    public static void main(String[] args) {
        A a = null;
        boolean b1 = a instanceof Object;//false
//        boolean b2 = twoArgs instanceof Integer;//comlile
        a = new A();
        boolean b3 = a instanceof Serializable;//false
        boolean b4 = a instanceof Comparable;//false

//        --

        if(a instanceof Object){
            System.out.println();
        }else if(a instanceof A){
            System.out.println();
        }else {
            System.out.println();
        }



    }
}
