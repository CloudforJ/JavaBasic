import java.util.stream.*;

public class StreamReduce {
    public static void main (String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);
    }
}