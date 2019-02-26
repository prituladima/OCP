package module7.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {

    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Stream<Integer>> supplier = () -> IntStream.generate(random::nextInt).limit(5_000).boxed();

        long start = System.currentTimeMillis();
        List<Integer> collect1 = supplier.get().sorted().collect(Collectors.toList());
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(isSorted(collect1));


        start = System.currentTimeMillis();
        List<Integer> collect2 = supplier.get().parallel().sorted().collect(Collectors.toList());
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(isSorted(collect2));


        start = System.currentTimeMillis();
        List<Integer> collect3 = supplier.get().unordered().sorted().collect(Collectors.toList());
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(isSorted(collect3));

        start = System.currentTimeMillis();
        List<Integer> collect4 = supplier.get().parallel().unordered().sorted().collect(Collectors.toList());
        finish = System.currentTimeMillis();
        System.out.println(finish - start);
        System.out.println(isSorted(collect4));


//
//        start = System.currentTimeMillis();
//        supplier.get().collect(Collectors.toList());
//        finish = System.currentTimeMillis();


    }

    private static boolean isSorted(List<Integer> collect3) {
        if (collect3.size() == 1) return true;
        for (int i = 1; i < collect3.size(); i++) {
            if (collect3.get(i - 1) > collect3.get(i)) return false;
        }
        return true;
    }

}
