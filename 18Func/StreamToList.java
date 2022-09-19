import java.util.List;
import java.util.stream.*;

public class StreamToList {
    public static void main (String[] args) {
        Stream<String> s = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        List<String> list = s.filter(str -> str != null && !str.isBlank()).collect(Collectors.toList());
        System.out.println(list);
    }
}