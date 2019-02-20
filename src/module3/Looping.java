package module3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Looping {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

        }

        list.stream().map(s -> s + "-").forEach(System.out::print);


        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        String jenny = favorites.merge("Jenny1", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 1);
        BiFunction<String, Integer, Integer> mapper1 = (k, v) -> v + 1;
        Integer jenny1 = counts.computeIfPresent("Jenny", mapper1);
        Integer sam1= counts.computeIfPresent("Sam", mapper1);

        Map<String, Integer> counts1 = new HashMap<>();
        counts.put("Jenny", 15);
        counts.put("Tom", null);
        Function<String, Integer> mapper2 = (k) -> 1;
        Integer jenny2 = counts.computeIfAbsent("Jenny", mapper2); // 15
        Integer sam2 = counts.computeIfAbsent("Sam", mapper2); // 1
        Integer tom2 = counts.computeIfAbsent("Tom", mapper2); // 1
        System.out.println(counts1); // {Tom=1, Jenny=15, Sam=1}

    }

    private Map<Integer, Integer> ms(int[] a) {
        Map<Integer, Integer> ms = new HashMap<>();
        for (int i : a) {
            ms.merge(i, 1, Integer::sum);
        }
        return ms;
    }
}
