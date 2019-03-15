package testfinal;

import java.util.*;

public class MapApiOverview {
    public static void main(String[] args) {
        String[] sa = {"charlie", "bob", "andy", "dave"};
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]);
    }

    private static void get(Map map) {
        map.values();
        map.containsKey(null);
        map.getOrDefault(null, 0);
    }
}
