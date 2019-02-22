package module4.collecting;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectionExample {
    public static void main(String[] args) {
        Supplier<Stream<String>> supplier = () -> Stream.of("lions", "tigers", "bears");


        Map<Integer, String> collect1 = supplier.get().collect(
                Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2)
        );
        System.out.println(collect1);
        System.out.println(collect1.getClass());

        Map<Integer, String> collect2 = supplier.get().collect(
                Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, ConcurrentSkipListMap::new)
        );
        System.out.println(collect2);
        System.out.println(collect2.getClass());

        Map<Integer, String> collect3 = supplier.get().collect(
                Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new)
        );
        System.out.println(collect3);
        System.out.println(collect3.getClass());


        System.out.println("--------------------------------------------------------------");


        Map<Integer, List<String>> collect4 = supplier.get().collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(collect4);
        System.out.println(collect4.getClass());

        Map<Integer, Set<String>> collect5 = supplier.get().collect(
                Collectors.groupingBy(String::length, Collectors.toSet())
        );
        System.out.println(collect5);
        System.out.println(collect5.getClass());


        Map<Integer, Set<String>> collect6 = supplier.get().collect(
                Collectors.groupingBy(String::length, Collectors.toSet())
        );
        System.out.println(collect6);
        System.out.println(collect6.getClass());


        Map<Boolean, List<String>> collect7 = supplier.get().collect(
                Collectors.partitioningBy(s -> s.length() > 5)
        );
        System.out.println(collect7);
        System.out.println(collect7.getClass());//java.util.stream.Collectors$Partition

        Map<Boolean, List<String>> collect8 = supplier.get().collect(
                Collectors.partitioningBy(s -> s.length() > 7)
        );
        System.out.println(collect8);
        System.out.println(collect8.getClass());//java.util.stream.Collectors$Partition


        Map<Integer, Optional<Character>> collect9 = supplier.get().collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy(
                                        Comparator.<Character>naturalOrder()//IF REMOVE <Character> IT WILL NOT COMPILE o_O
                                )
                        )
                )
        );
        System.out.println(collect9);
        System.out.println(collect9.getClass());


        //exception
        Map<Integer, String> collect = supplier.get().collect(
                Collectors.toMap(String::length, k -> k)
        );
        System.out.println(collect);


    }
}
