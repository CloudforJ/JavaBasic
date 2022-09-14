import java.util.Map;
import java.util.HashMap;

public class IterMap {
    public static void main (String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(value);
        } 
    }
}