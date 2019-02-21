package module4;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonTerminalOperation {
    public static void main(String[] args) {
        Consumer<Boolean> out = System.out::println;


        int[] array = {11, 22, 33, 44, 55};

        out.accept(Arrays.stream(array).allMatch(x -> x % 11 == 0));

        int[] array2 = {11, 22, 33, 44, 510};
        out.accept(Arrays.stream(array2).allMatch(x -> x % 11 == 0));

        int[] array3 = {11, 22, 33, 44, 510};
        out.accept(Arrays.stream(array3).anyMatch(x -> x % 11 == 0));

        int[] array4 = {10, 21, 3, 4, 1};
        out.accept(Arrays.stream(array4).anyMatch(x -> x % 11 == 0));

        int[] array5 = {10, 21, 3, 4, 1};
        out.accept(Arrays.stream(array5).noneMatch(x -> x % 11 == 0));

        int[] array6 = {11, 510};
        out.accept(Arrays.stream(array6).noneMatch(x -> x % 11 == 0));

        //////////
        Consumer<Long> outLong = System.out::println;
        int[] array7 = {1, 10};
        outLong.accept(Arrays.stream(array7).count());

        Consumer<Integer> outInt = System.out::println;
        int[] array8 = {1, 10};
        outInt.accept(Arrays.stream(array8).sum());

        int[] array9 = {1, 10};
        outInt.accept(Arrays.stream(array9).findFirst().getAsInt());

        int[] array10 = {1, 10};
        outInt.accept(Arrays.stream(array10).findAny().getAsInt());

        int[] array11 = {1, 10};
        outInt.accept(Arrays.stream(array11).min().getAsInt());

        int[] array12 = {1, 10};
        outInt.accept(Arrays.stream(array12).max().getAsInt());

        int[] array13 = {1, 10};
        outInt.accept(Arrays.stream(array13).reduce(Integer.MAX_VALUE, Integer::min));
        outInt.accept(Arrays.stream(array13).reduce(Integer.MIN_VALUE, Integer::max));
        outInt.accept(Arrays.stream(array13).reduce(0, Integer::sum));
        outLong.accept(Arrays.stream(array13).asLongStream().reduce(0L, Long::sum));
        //outInt.accept(Arrays.stream(array13).reduce(Integer.MAX_VALUE, Integer::min));



    }
}
