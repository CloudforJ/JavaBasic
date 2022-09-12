import java.lang.reflect.Field;

public class ReflectionDemo3 {
    public static void main(String[] args) throws Exception {
        Person2 p = new Person2("xiaoming");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
        f.set(p, "xiaojiang");
        System.out.println(p.getName());
    }
}


class Person2 {
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}