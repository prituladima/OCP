package module4;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptioalWithStreams {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(()->Double.NaN));

        System.out.println("---------------");
        printStatics(IntStream.rangeClosed(1, 10));
        printStatics(IntStream.rangeClosed(1, 0));
        printStatics(IntStream.rangeClosed(1, 1));



    }

    private static void printStatics(IntStream stream){
        IntSummaryStatistics statistics = stream.summaryStatistics();
        System.out.println("---------------");
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());
    }
}
