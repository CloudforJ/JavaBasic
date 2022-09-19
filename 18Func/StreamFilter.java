import java.util.stream.IntStream;

public class StreamFilter {
    public static void main (String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(n -> n % 2 != 0)
        .forEach(System.out::println);
    }
}