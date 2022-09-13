import java.util.*;

public class UseIterator {
    public static void main (String[] args) {
        
        List<String> list = List.of("Apple", "Orange", "Banana");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        } 
    }
}