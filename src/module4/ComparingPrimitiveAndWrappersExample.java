package module4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ComparingPrimitiveAndWrappersExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (a, b) -> a + b));

        IntStream primitiveStream = IntStream.of(1, 2, 3);
        System.out.println(primitiveStream.reduce(0, (a, b) -> a + b));

        primitiveStream = IntStream.of(1, 2, 3);
        System.out.println(primitiveStream.sum());

        primitiveStream = IntStream.of(1, 2, 3);
        System.out.println(primitiveStream.reduce(Integer.MIN_VALUE, Integer::max));

        primitiveStream = IntStream.of(1, 2, 3);
        System.out.println(primitiveStream.max().orElse(-1));

        primitiveStream = IntStream.of(1, 2, 3);
        System.out.println(primitiveStream.average().orElse(-1));


        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 2.0, 1.2);
        oneValue.forEach(System.out::println);
        System.out.println();
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);

        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        fractions.limit(3).forEach(System.out::println);


        IntStream count = IntStream.iterate(1, n -> ++n).limit(5);
        count.forEach(System.out::println);
        count = IntStream.range(1, 6);
        count.forEach(System.out::println);
        count = IntStream.rangeClosed(1, 5);
        count.forEach(System.out::println);





    }
}
