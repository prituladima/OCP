package module4.collecting;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExamples {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        String collect = stream.collect(String::new, String::concat, String::concat);
        String collect1 = stream.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append).toString();
        String collect2 = stream.collect(Collectors.joining());


    }
}
