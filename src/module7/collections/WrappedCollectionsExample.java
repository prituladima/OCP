package module7.collections;

import java.util.*;

public class WrappedCollectionsExample {

    public static void main(String[] args) {

        Map<String, Object> foodData = new HashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String, Object> synchronizedFoodData
                = Collections.synchronizedMap(foodData);
        synchronized (synchronizedFoodData) {
            for (String key : synchronizedFoodData.keySet())
                synchronizedFoodData.remove(key);
        }

        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4, 3, 52)));
        synchronized (list) {
            for (int data : list)
//                list.remove(data);
                System.out.print(data + " ");
        }

    }
}
