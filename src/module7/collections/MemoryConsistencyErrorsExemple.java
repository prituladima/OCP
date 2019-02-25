package module7.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryConsistencyErrorsExemple {
    public static void main(String[] args) {
        Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);

        Map<String, Object> foodData1 = new HashMap<String, Object>();
        foodData1.put("penguin", 1);
        foodData1.put("flamingo", 2);
        for (String key : foodData1.keySet())
            foodData1.remove(key);//ConcurrentModificationException at runtime, since the
//        iterator keyset() is not properly updated after the first element is removed.
    }
}
