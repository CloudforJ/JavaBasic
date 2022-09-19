import java.util.List;
import java.util.stream.*;

public class StreamSorted {
    public static void main (String[] args) {
        List<String> list = List.of("Orange", "apple", "Banana")
        .stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println(list);
    }
}