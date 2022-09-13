import java.util.*;
public class ListToArrayDemo1 {
    public static void main (String[] args) {
        List<String> list = List.of("Apple", "Banana", "Pear");
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }
    }
}