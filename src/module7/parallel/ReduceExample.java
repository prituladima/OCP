package module7.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ReduceExample {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR

        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .reduce("", String::concat));


        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .collect((Supplier<ArrayList<String>>) ArrayList::new, ArrayList::add, ArrayList::addAll));

        System.out.println(Arrays.asList("w", "o", "l", "f")
                .parallelStream()
                .collect(Collectors.toList()));

    }
}
