package module3;

import java.util.*;

public class Generic<Object> {
    public static void main(String[] args) {
        Generic<String> g = new Generic<>();
//        Generic<Object> g2 = new Generic();//will not compile


        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.print(q);

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.containsKey("123"));//Compiler error

        List<String> list = Arrays.asList("1", "2", "3");
        Iterator iter = list.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a, b) -> a + b);
        map.merge(3, 3, (a, b) -> a + b);
        System.out.println(map);
    }

    public static <T> T identity(T t) {
        return t;
    }
}
