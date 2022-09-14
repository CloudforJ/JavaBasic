import java.util.List;
public class UseEqualsDemo {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        System.out.println(list.contains(new String("C")));
        System.out.println(list.indexOf(new String("C")));
    }
}