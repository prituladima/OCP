package module3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
        total(list);
        total1(list);

        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
//        addSound(strings);
//        addSound(objects);


        List<? super IOException> exceptions = new ArrayList<Object>();
//         exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

    }

    public static long total1(List list) {
        long count = 0;
        for (Object obj : list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list)
            count += number.longValue();
        return count;
    }
}
