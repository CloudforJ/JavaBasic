import java.util.*;
public class UseContains {
    public static void main (String[] args) {
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains("X"));
        System.out.println(list.contains("C"));
        System.out.println(list.indexOf("X"));
        System.out.println(list.indexOf("C"));
    }
}