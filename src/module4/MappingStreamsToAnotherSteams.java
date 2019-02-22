package module4;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingStreamsToAnotherSteams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);

        Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3);

//        WAY TO COPY STREAM

        streamToIntStream(supplier.get()).flatMap(IntStream::of).forEach(System.out::println);

        streamToDoubleStream(supplier.get()).flatMap(DoubleStream::of).forEach(System.out::println);//throws error

        streamToLongStream(supplier.get()).flatMap(LongStream::of).forEach(System.out::println);//throws error

//        WRONG WAY TO COPY STREAM
        stream = Stream.of(1, 2, 3);

        streamToIntStream(stream).flatMap(IntStream::of).forEach(System.out::println);

        streamToDoubleStream(stream).flatMap(DoubleStream::of).forEach(System.out::println);//throws error

        streamToLongStream(stream).flatMap(LongStream::of).forEach(System.out::println);//throws error


    }

    private static IntStream streamToIntStream(Stream<? extends Number> stream) {
        return stream.mapToInt(Number::intValue);
    }

    private static DoubleStream streamToDoubleStream(Stream<? extends Number> stream) {
        return stream.mapToDouble(Number::doubleValue);
    }

    private static LongStream streamToLongStream(Stream<? extends Number> stream) {
        return stream.mapToLong(Number::longValue);
    }


    private static Stream<Object> intStreamToStream(IntStream intStream) {
        return intStream.mapToObj(x -> new Object());
    }

    private static Stream<Object> doubleStreamToStream(DoubleStream intStream) {
        return intStream.mapToObj(x -> new Object());
    }

    private static Stream<Object> longStreamToStream(LongStream intStream) {
        return intStream.mapToObj(x -> new Object());
    }

    private static <X> IntStream streamToIntStreamUsingFlat(Stream<X> stream) {
        return stream
                .mapToInt(Objects::hashCode)
                .flatMap(IntStream::of);
    }


}
