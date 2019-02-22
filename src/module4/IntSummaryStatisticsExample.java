package module4;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatisticsExample {
    public static void main(String[] args) {

        IntSummaryStatistics statistics = new IntSummaryStatistics();
        for (int i = 0; i < 2000; i++) {
            statistics.accept(i);
        }

        printStatics(statistics);

    }

    private static void printStatics(IntSummaryStatistics statistics){
        System.out.println("---------------");
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());
    }
}
