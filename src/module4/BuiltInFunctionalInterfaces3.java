package module4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class BuiltInFunctionalInterfaces3 {
    public static void main(String[] args) {

        Supplier<ArrayList<String>> supplier = ArrayList::new;
//        Supplier<ArrayList<String>> supplier1 = ArrayList<>::new;//WILL NOT COMPILE
        Supplier<ArrayList<String>> supplier2 = ArrayList<String>::new;

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        Function<String, Integer> function = map::get;
        b1.accept("key", 50);
        Integer i = function.apply("key");
        System.out.println(i);

        MySuppl out = System.out::println;

        BiPredicate<String, String> biPredicate1 = String::contains;
        BiPredicate<String, String> biPredicate2 = String::startsWith;
        BiPredicate<String, String> biPredicate3 = String::endsWith;

        out.print(biPredicate1.test("aaabbbaaa", "abbba"));

        BiFunction<String, String , String > biFunction = String::concat;
        out.print(biFunction.apply(null, null));


    }

    private interface MySuppl {
        void print(Object o);
    }

}
