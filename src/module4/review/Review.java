package module4.review;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.*;

public class Review {
    public static void main(String[] args) {
        if (false) {
            Stream<String> stream = Stream.iterate("", (s) -> s + "1");
            System.out.println(stream.limit(2).map(x -> x + "2"));
        }

        if (false) {
            Predicate<? super String> predicate = s -> s.startsWith("g");
            Stream<String> stream1 = Stream.generate(() -> "growl! ");
            Stream<String> stream2 = Stream.generate(() -> "growl! ");
            boolean b1 = stream1.anyMatch(predicate);
            boolean b2 = stream2.allMatch(predicate);
            System.out.println(b1 + " " + b2);
        }

        if (false) {
            Predicate<? super String> predicate = s -> s.length() > 3;
            Stream<String> stream = Stream.iterate("-", (s) -> s + s);
            boolean b1 = stream.noneMatch(predicate);
            boolean b2 = stream.anyMatch(predicate);
            System.out.println(b1 + " " + b2);
        }

        if (false) {
            Stream<String> s = Stream.generate(() -> "meow");
            boolean match = s.noneMatch(String::isEmpty);
            System.out.println(match);
        }

        if (false) {
            LongStream ls = LongStream.of(1, 2, 3);
            OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
            if (opt.isPresent()) System.out.println(opt.getAsLong()
            );
            opt.ifPresent(System.out::println);
        }

        if (false) {
            System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.
                    joining("")));
        }

        if (false) {
            Supplier<String> x = String::new;
            BiConsumer<String, String> y = (a, b) -> System.out.println();
            UnaryOperator<String> z = a -> a + a;
        }

        if (false) {
            List<Integer> l1 = Arrays.asList(1, 2, 3);
            List<Integer> l2 = Arrays.asList(4, 5, 6);
            List<Integer> l3 = Arrays.asList();
            Stream.of(l1, l2, l3)
                    .flatMap(Collection::stream)
                    .map(x -> x + 1)
                    .forEach(System.out::print);
        }

        if (false) {
            Stream<Integer> s = Stream.of(1);
            IntStream is = s.mapToInt(x -> x);
            DoubleStream ds = s.mapToDouble(x -> x);
//             Stream<Integer> s2 = ds.mapToInt(x -> (int)x);//
//             s2.forEach(System.out::print);
        }

        if (false) {
            int n = 10;
            Supplier<Stream<Integer>> supplier = () -> IntStream.rangeClosed(1, n).boxed();
            Predicate<Integer> predicate = x -> x > n / 2;

            Map<Boolean, Set<Integer>> collect1 = supplier.get().collect(
                    Collectors.partitioningBy(predicate, Collectors.toSet())//DOESN'T WORK WITH PRIMITIVE STREAMS
            );

            Map<Boolean, List<Integer>> collect2 = supplier.get().collect(
                    Collectors.partitioningBy(predicate, Collectors.toList())
            );

            Map<Boolean, Map<Integer, Integer>> collect3 = supplier.get().collect(
                    Collectors.partitioningBy(predicate, Collectors.toMap(x -> x & 1, x -> x, Integer::sum))
            );

            System.out.println(collect1);
            System.out.println(collect2);
            System.out.println(collect3);

        }

        if(false){
            Stream<String> s = Stream.empty();
            Stream<String> s2 = Stream.empty();
            Map<Boolean, List<String>> p = s.collect(
                    Collectors.partitioningBy(b -> b.startsWith("c")));
            Map<Boolean, List<String>> g = s2.collect(
                    Collectors.groupingBy(b -> b.startsWith("c")));
            System.out.println(p + " " + g);
        }

        if(false){
            DoubleStream s = DoubleStream.of(1.2, 2.4);
            s.peek(System.out::println).filter(x -> x > 2).count();
        }

        if(true){List<Integer> l = IntStream.range(1, 6)
                .mapToObj(i -> i).collect(Collectors.toList());
            l.forEach(System.out::println);

            IntStream.range(1, 6)
                    .forEach(System.out::println);
        }
    }
}
