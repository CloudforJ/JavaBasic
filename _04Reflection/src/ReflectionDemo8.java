import java.lang.reflect.Method;

public class ReflectionDemo8 {
    public static void main(String[] args) throws Exception {
        Method h = Person8.class.getMethod("hello");
        h.invoke(new Student8());
    }
}

class Person8 {
    public void hello() {
        System.out.println("Person:hello");
    }
}

class Student8 extends Person8 {
    public void hello() {
        System.out.println("Student:hello");
    }
}