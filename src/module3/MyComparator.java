package module3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, new MyComparator());
        for (String s: values)
            System.out.print(s + " ");

        Map<Integer, Integer> map = new HashMap<>(10);
         for (int i = 1; i <= 10; i++) {
         map.put(i, i * i);
         }
        System.out.println(map.get(4));
    }
}
