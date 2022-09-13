import java.util.*;

public class ListToArrayDemo2 {
    public static void main (String[] args) {
        List<Integer> list = List.of(12, 34, 36);
        Number[] array = list.toArray(new Number[3]);
        for (Number n : array) {
            System.out.println(n);
        }
    }
}