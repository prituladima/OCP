package module4;

import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class BuiltInFunctionalInterfaces2 {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "";
        Supplier<Object> supplier1 = Object::new;

        Consumer<String> consumer = StringBuilder::new;
        Consumer<Exception> consumer1 = RuntimeException::new;
        Consumer<String> consumer2 = Integer::new;
        Consumer<byte[]> consumer3 = String::new;

        BiConsumer<String, String> biConsumer = String::equalsIgnoreCase;
        BiConsumer<String, String> biConsumer1 = String::equals;
        TripleConcumer<char[], Integer, Integer> tripleConcumer = String::new;

        Predicate<String> predicate = x -> true;
        Predicate<String> predicate1 = x -> Boolean.FALSE;
        Predicate<List<String>> predicate2 = List::isEmpty;
        BiPredicate<List<String>, String> predicate3 = List::contains;
        Predicate<Iterator<String>> predicate4 = Iterator::hasNext;

        Function<Integer, int[]> function = int[]::new;
        BiFunction<byte[], Integer, String> function1 = String::new;

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        UnaryOperator<String> unaryOperator1 = String::toString;
        UnaryOperator<String> unaryOperator2 = String::new;

        BinaryOperator<String> unaryOperator3 = String::concat;
        BinaryOperator<Integer> unaryOperator4 = Integer::sum;


    }

    private interface TripleConcumer<T, U, V> {
        String con(T t, U u, V v);
    }

}
