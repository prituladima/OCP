package module4;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfinitSteams {
    public static void main(String[] args) {

        Stream<Double> randome = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);

        //All divisors of number in O(sqrt(n))
        int n = 10000;
        Consumer<Object> out = System.out::println;
        IntStream.range(1, (int) Math.sqrt(n) + 1)
                .filter(x -> n % x == 0)
                .flatMap(x -> IntStream.of(x, n / x))
                .distinct()
                .sorted()
                .forEach(out::accept);

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (Integer integer : list) {
            out.accept(integer);
        }


    }

}
