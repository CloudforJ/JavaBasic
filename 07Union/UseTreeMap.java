import java.util.*;

public class UseTreeMap {
    public static void main (String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}