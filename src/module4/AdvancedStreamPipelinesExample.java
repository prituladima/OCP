package module4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Consumer;

public class AdvancedStreamPipelinesExample {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(110);
        if (optional.isPresent()) {
            optional.map(String::valueOf)
                    .filter(s -> s.length() >= 3)
                    .ifPresent(System.out::println);
        }

//        Consumer<String> consumer = AdvancedStreamPipelinesExample::e;
        SaveConsumer<String> consumer1 = AdvancedStreamPipelinesExample::e;
        Optional<String> s = optional.flatMap(x -> Optional.<String>of(String.valueOf(x)));


    }

    private static void e(String s) throws IOException{
        throw new IOException(s);
    }

    @FunctionalInterface
    private static interface SaveConsumer<T>{
        void accept(T t) throws IOException;
    }
}
