import java.lang.reflect.Method;

public class ReflectionDemo7 {
    public static void main(String[] args) throws Exception {
        Person7 p = new Person7();
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "bob");
        System.out.println(p.name);
    }
}

class Person7 {
    String name;
    private void setName(String name) {
        this.name = name;
    }
}