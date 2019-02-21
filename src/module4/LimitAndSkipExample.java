package module4;

import java.util.stream.Stream;

public class LimitAndSkipExample {
    public static void main(String[] args) {
        Stream.<Integer>iterate(1, i -> ++i)
                .skip(5)
                .limit(2)
                .forEach(System.out::println);


    }
}
