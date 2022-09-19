import java.util.stream.*;

public class StreamReduceDemo {
    public static void main (String[] args) {
        int s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (acc, n) -> acc * n);
        System.out.println(s);
    }
}