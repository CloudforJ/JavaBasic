import java.util.*;
import java.util.stream.*;

public class StreamToMap {
    public static void main (String[] args) {
        Stream<String> stream = Stream.of("APPL:Apple", "MSFT:Microsoft");
        Map<String, String> map = stream.collect(Collectors.toMap(
            s -> s.substring(0, s.indexOf(':')),
            s -> s.substring(s.indexOf(':') + 1)));
        System.out.println(map);
    }
}