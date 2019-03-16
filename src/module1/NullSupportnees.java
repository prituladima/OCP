package module1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NullSupportnees {


    //arraylist and linkedlist cowal
    //support nulls

//    PriorityQueue and ArrayDeque
//    doesn't support null

//    HashMap (LinkedHashMap) works with key-value
//    null-null

//    ConcarrentHashMap and ConcurrentSkipListMap
//        does not support null - null


//    TreeMap key must be comparable
//    null keys are not allowed

    public static void main(String[] args) {

        Map m = new TreeMap();
//        m.put("kaka", null);
//        m.put(null, null);
//        m.put(null, null);
//        m.put(null, null);
//        m.containsKey(null);
//        System.out.println(m.get(null));

        if (false) {
            return;
        }

        Map<Integer, Integer> map1 = new ConcurrentHashMap<>();
        //map1.get(null);//
//        map1.containsKey(null);
//        map1.put(5, null);
        System.out.println(map1.put(1, 5));
        System.out.println(map1.put(1, 5));
        //return previous value

        map1 = new LinkedHashMap<>();
        map1.get(null);
        map1.containsKey(null);
        map1.put(null, null);


        map1 = new HashMap<>();
        map1.get(null);
        map1.containsKey(null);
        map1.put(5, null);
        map1.put(null, null);
        map1.put(null, null);

        map1 = new ConcurrentSkipListMap<>();
//        map1.get(null);
//        map1.containsKey(null);
//        map1.put(null, null);

        map1 = new TreeMap<>();
//        map1.get(null);
//        map1.containsKey(null);
        map1.put(6, null);
        map1.put(7, null);
//        map1.put(null, null);

        List<Integer> list = new ArrayList<>();
        list.add(null);
//        list.remove();

        list = new LinkedList<>();
        list.add(null);

        list = new CopyOnWriteArrayList<>();
        list.add(null);


        Deque<Integer> q = new LinkedList<>();
        q.add(null);
        q.addLast(null);

        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(null);

//        Queue<Integer> queue2 = new PriorityQueue<>();
//        queue2.add(null);


    }
}
