package module4;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;

public class Optionals {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 5};
        OptionalDouble average = Arrays.stream(a).average();
        DoubleConsumer out = System.out::println;

        if (average.isPresent()) {
            out.accept(average.getAsDouble());
        }
    }



    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

}
