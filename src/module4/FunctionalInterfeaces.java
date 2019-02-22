package module4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfeaces {

    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> Math.random();
        DoubleConsumer doubleConsumer = Double::new;
        DoublePredicate doublePredicate = x -> x > 0;

        DoubleFunction<String> doubleFunction = String::valueOf;
        DoubleUnaryOperator doubleUnaryOperator = x -> x / x;
        DoubleBinaryOperator doubleBinaryOperator = (x, y) -> x + y;

        ToDoubleFunction<Number> toDoubleFunction = Number::doubleValue;
        ToDoubleBiFunction<String, String> toDoubleBiFunction = (x, y) -> Double.parseDouble(x.concat(y));
        ObjDoubleConsumer<String> objDoubleConsumer = (o, d) -> System.out.println(o);




        IntSupplier intSupplier = () -> new Random().nextInt();
        IntConsumer intConsumer = String::valueOf;
        IntPredicate intPredicate = x -> Boolean.FALSE;

        IntFunction<int[]> intFunction = int[]::new;
        IntUnaryOperator intUnaryOperator = x -> ~x;
        IntBinaryOperator intBinaryOperator = (x, y) -> x & y + x | y;

        ToIntFunction<Number> toIntFunction = Number::intValue;
        ToIntBiFunction<String, String> toIntBiFunction = (x, y) -> Integer.parseInt(x.concat(y));
        ObjIntConsumer<String> objIntConsumer = (o, d) -> System.out.println(o);



        LongSupplier longSupplier = () -> Long.MAX_VALUE;
        LongConsumer longConsumer = Long::new;
        LongPredicate longPredicate = x -> x > 10;

        LongFunction<Long> longFunction = Long::new;
        LongUnaryOperator longUnaryOperator = i -> i + 10;
        LongBinaryOperator longBinaryOperator = Long::compare;

        ToLongFunction<Number> toLongFunction = Number::longValue;
        ToLongBiFunction<String, String> tolongBiFunction = (x, y) -> Long.parseLong(x.concat(y));
        ObjLongConsumer<String> objLongConsumer = (o, d) -> System.out.println(o);




        BooleanSupplier booleanSupplier = () -> Boolean.FALSE;
//        BooleanConsumer
//        BooleanPredicate

//        BooleanFunction
//        BooleanUnaryOperator
//        BooleanBinaryOperator


    }

}
