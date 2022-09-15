import java.util.stream.*;

public class UseStream {
    public static void main (String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        stream.forEach(System.out::println);
    }
}