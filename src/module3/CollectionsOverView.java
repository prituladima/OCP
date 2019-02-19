package module3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CollectionsOverView {
    public static void main(String[] args) {
//        Map
//        arrays,
//                ArrayLists,
//                wrapper classes,
//                autobox-ing,
//                the diamond operator,
//        searching,
//        and sorting.
        String[] array = { "gerbil", "mouse" }; // [gerbil, mouse]
        List<String> list = Arrays.asList(array); // returns fixed size list
        list.set(1, "test"); // [gerbil, test]
        //array[0] = "new"; // [new, test]
        //String[] array2 = (String[]) list.toArray(); // [new, test]
        System.out.println(list.getClass());
        list.add("sds");
        list.remove(1);

    }
}
