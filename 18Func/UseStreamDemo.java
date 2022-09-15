import java.util.*;
import java.util.stream.*;

public class UseStreamDemo {
    public static void main (String[] args) {
        Stream<String> stream1 = Arrays.stream(new String[] {"A", "B", "C"});
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}