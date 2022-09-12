import java.lang.reflect.Field;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        Object p = new Person1("xiaoming");
        Class c = p.getClass();
        try {
            Field f = c.getDeclaredField("name");
            f.setAccessible(true);
            Object value = f.get(p);
            System.out.println(value);
        } catch(Exception e) {
            e.printStackTrace();
        }

        // System.out.println(value);
    }
}

class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }
}