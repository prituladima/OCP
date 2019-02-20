package module4;

import java.util.function.Predicate;

public class EffectivelyFinal {

    public static void main(String[] args) {
        final Integer a;
        a = 5;//Will COMPILE O_o
        Predicate<Integer> predicate = i -> i < a;
    }
}
