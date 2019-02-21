package module4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1)
                .peek(System.out::print)
                .limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
        System.out.println();
        Stream.iterate(1, x -> x + 1)
                .limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);

        System.out.println();
        Stream.iterate(1, x -> x + 1)
                .limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);


        // TODO: 2/21/2019

    }
}
