import java.util.List;
import java.util.stream.*;

public class StreamMap {
    public static void main (String[] args) {
        List.of(" Apple ", "oRange ", "Banana ", "PEAR")
        .stream()
        .map(String::trim)
        .map(String::toLowerCase)
        .forEach(System.out::println);
    }
}