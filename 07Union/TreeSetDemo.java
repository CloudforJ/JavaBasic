import java.util.*;

public class TreeSetDemo {
    public static void main (String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("orange");
        for (String s : set) {
            System.out.println(s);
        }
    }
}