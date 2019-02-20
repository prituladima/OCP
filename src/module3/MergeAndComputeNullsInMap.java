package module3;

import java.util.*;

public class MergeAndComputeNullsInMap {

    public static void main(String[] args) {

        HashMap<String, String> m = new HashMap<>();

        m.merge("key1", "kdjd", (x, y) -> x);
        m.merge("key2", "kdjd", (x, y) -> x);

        List list = new ArrayList();//
        list.add("one");
        list.add("two");
        list.add(7);
//        for (String s : list)//Compiler error
//            System.out.print(s);

        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null)
            System.out.print(greetings.pop());

         //////////////////////////////////////////////////

//        HashSet<Number> hs = new HashSet<Integer>();
         HashSet<? super ClassCastException> set = new HashSet<Exception>();
         List<String> list1 = new Vector<String>();
//         List<Object> values = new HashSet<Object>();
//         List<Object> objects = new ArrayList<? extends Object>();
         Map<String, ? extends Number> hm = new HashMap<String, Integer>();

    }

}
