import java.util.*;

public class ListDemo {
    public static void main (String[] args) {
        /* code */
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add(null);
        String o = list.get(3);
        System.out.println(list.size());
        System.out.println(o);
    }
}

