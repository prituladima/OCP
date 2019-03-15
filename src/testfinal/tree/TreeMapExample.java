package testfinal.tree;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();

        map.put(1, null);
        map.put(2, null);
        map.put(6, null);
        map.put(100, null);



        SortedMap<Integer, Integer> subMap = map.subMap(1, 10);

        System.out.println(subMap);

        subMap.put(2, null);
        subMap.put(3, null);
        subMap.put(4, null);
        subMap.put(9, null);

        System.out.println(subMap);

        subMap.put(1, null);
        subMap.put(9, null);
        subMap.put(10, null);//will throws error


    }
}
