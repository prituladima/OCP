package module4;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class UsingStreams {
    public static void main(String[] args) {
        Supplier<Stream<String>> supplier = Stream::<String>empty;
        Stream<String> empty = Stream.<String>empty();
        Stream<String> empty1 = supplier.get();

//        TToInt function = Stream::of;
        TToInt2 function1 = Stream::of;
        function1 = function1.addSemi();

        Stream<String> single = function1.get("jjkd");
        Consumer<Object> out = System.out::println;
        single.forEach(out);

        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        ArrayToStreamFunction<Integer> func = Stream::of;
        func = func.sorted().reverce().distinct();

        func.get(1, 3, 4, 4, 4, 7, 1, -3).forEach(out);

        Stream<Integer> fromArray1 = Stream.of(1, 2, 3);



    }

    @FunctionalInterface
    private interface ArrayToStreamFunction<T> {
        Stream<T> get(T... array);

        default ArrayToStreamFunction<T> reverce() {
            return array -> {
                T[] array1 = array.clone();
                for (int i = 0, j = array1.length - 1; i < j; i++, j--) {
                    T buf = array1[i];
                    array1[i] = array1[j];
                    array1[j] = buf;
                }
                return get(array1);
            };
        }

        default ArrayToStreamFunction<T> sorted() {
            return array -> get(array).sorted();
        }

        default ArrayToStreamFunction<T> distinct() {
            return array -> get(array).distinct();
        }
    }

    //    @FunctionalInterface WILL NOT COMPILE
    private abstract class TToInt {
        abstract Stream<String> get(int i);
    }

    @FunctionalInterface
    private interface TToInt2 {
        abstract Stream<String> get(String i);

        default TToInt2 addSemi() {
            return s -> get(s + " -> ");
        }

    }

}
