package module10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class URLFormat {
    public static void main(String[] args) {
        Stream<String> url = Stream.of("module10", "derby", "//localhost/zoo1");
        System.out.println(url.collect(Collectors.joining(":")));
    }
}
