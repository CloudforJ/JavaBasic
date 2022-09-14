import java.util.Map;
import java.util.HashMap;
public class FruitMap {
    public static void main (String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 123);
        map.put("Pear", 456);
        System.out.println(map.get("Apple"));
        map.put("Apple", 789);
        System.out.println(map.get("Apple"));
    }
}