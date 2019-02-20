package module4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.function.*;

public class BuiltInFunctonInterfaces {

    public static void main(String[] args) {

        Queue queue = new ArrayDeque();
        //Supplier<Object> s = Queue::poll;
        Function<Queue, Object> s = Queue::poll;


        List<Queue> list = new ArrayList<>();

        Consumer<Queue> consumer = Queue::poll;
        list.stream().peek(Queue::poll).map(s).forEach(System.out::print);


        BiConsumer<String, String> biConsumer = BuiltInFunctonInterfaces::sum;
        Predicate<String> predicate = String::isEmpty;

        BiPredicate<String, String> biPreicate = String::equalsIgnoreCase;
        BiPredicate<String, String> biPreicate2 = BuiltInFunctonInterfaces::twoArgs;
        BiPredicate<String, String> or = biPreicate.negate().or(biPreicate2);

        Function<String, String> function = String::trim;


        BiFunction<String, String, String> biFunction = String::concat;
        BiFunction<String, String, String> biFunction2 = BuiltInFunctonInterfaces::concate;


        UnaryOperator<String> unaryOperator = String::trim;
        BuiltInFunctonInterfaces builtInFunctonInterfaces = new BuiltInFunctonInterfaces();

        BinaryOperator<String> binaryOperator = BuiltInFunctonInterfaces::concate;


        BinaryOperator<String> binaryOperator1 = builtInFunctonInterfaces::concate1;


        BinaryOperator<String> binaryOperator2 = String::concat;

//        BinaryOperator<String> binaryOperator3 = builtInFunctonInterfaces::concate;
    }

    public  String concate1(String a, String b) {
        return a + b;
    }


    public static String concate(String a, String b) {
        return a + b;
    }

    public static boolean twoArgs(String a, String b) {
        return false;
    }

    public static int sum(String a, String b) {
        return 0;
    }

}
