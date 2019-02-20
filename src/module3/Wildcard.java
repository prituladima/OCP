package module3;

import java.io.IOException;
import java.util.*;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
//         ArrayDeque<?> list = new ArrayDeque<String>();//not a list//WRONG
//         ArrayList<? super Date> list = new ArrayList<Date>();
//         List<?> list = new ArrayList<?>();//WRONG
//         List<Exception> list = new LinkedList<IOException>();//WRONG
         Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}
