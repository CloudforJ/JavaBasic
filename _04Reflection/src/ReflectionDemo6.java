import java.lang.reflect.Method;

public class ReflectionDemo6 {
    public static void main(String[] args) throws Exception {
        Method m = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m.invoke(null, "12345");
        System.out.println(n);
    }
}
