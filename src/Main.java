import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);

        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));

        //DOES NOT FULLFILL COMPARATOR CONTRACT
        System.out.println(ls.stream().max(Integer::max).get());


        System.out.println(ls.stream().max(Integer::compare).get());

        //DOES NOT FULLFILL COMPARATOR CONTRACT
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b));
    }
}
