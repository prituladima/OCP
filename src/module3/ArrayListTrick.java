package module3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTrick {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);//E remove(int index);
        numbers.remove(new Integer(5));//boolean remove(Object o)
        System.out.println(numbers);
    }
}
