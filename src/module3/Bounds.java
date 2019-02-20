package module3;

import java.util.ArrayList;
import java.util.List;

public class Bounds {

    public static void main(String[] args) {
        //Unbounded wildcard
        List<?> l1 = new ArrayList<String>();
        //Helper with an upper bound
        List<? extends Exception> l2 = new ArrayList<RuntimeException>();
        //Helper with twoArgs lower bound
        List<? super Exception> l3 = new ArrayList<Object>();

        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords); // DOES NOT COMPILE
    }

    public static void printList(List<?> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (Object x : list) System.out.println(x);
    }
}
