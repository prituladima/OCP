package module7.parallel;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3);
        Supplier<Stream<Integer>> supplierParallel = () -> supplier.get().parallel();
        Supplier<Stream<Integer>> supplierParallelUnordered = () -> supplierParallel.get().unordered();


        Consumer<Integer> out = x -> System.out.print(x + " ");

        System.out.println(supplier.get().isParallel());
        System.out.println(supplierParallel.get().isParallel());
        System.out.println(supplierParallel.get().flatMap(Stream::of).isParallel());

        supplier.get().forEach(out);
        System.out.println();
        supplierParallel.get().forEach(out);
        System.out.println();
        Stream.concat(supplier.get(), supplierParallel.get()).forEach(out);

        System.out.println();
        supplier.get().forEachOrdered(out);
        System.out.println();
        supplierParallel.get().forEachOrdered(out);
        System.out.println();
        Stream.concat(supplier.get(), supplierParallel.get()).forEachOrdered(out);


    }
}
