import java.util.*;

public class SetDemo {
    public static void main (String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        System.out.println(set.add("xyz"));
        System.out.println(set.contains("xyz"));
        System.out.println(set.contains("XYZ"));
        System.out.println(set.remove("hello"));
        System.out.println(set.size());
    }
}