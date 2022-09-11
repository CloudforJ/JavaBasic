import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Jack"};
        var sj = new StringJoiner(",", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());

        var str = String.join(",", names);
        System.out.println(str);
    }
}