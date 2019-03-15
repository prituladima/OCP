package testfinal.tree;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

    public static void main(String[] args) {
        NavigableMap<Integer, Integer> navigableMap = new TreeMap<>();

        for (int i = 0; i < 20; i++)
            navigableMap.put(i, null);

        System.out.println(navigableMap.higherKey(2));//more
        System.out.println(navigableMap.ceilingKey(2));//equals of more

        System.out.println(navigableMap.floorKey(2));//equals or less
        System.out.println(navigableMap.lowerKey(2));//less

    }

}
