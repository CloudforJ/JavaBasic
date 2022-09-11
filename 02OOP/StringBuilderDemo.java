public class StringBuilderDemo {
    public static void main(String[] args) {
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("zhangsan")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }
}