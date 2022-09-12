public class ReflectionDemo4 {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student4.class;
        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));

        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}

class Person4 {
    public String getName() {
        return "Person";
    }
}

class Student4 extends Person4 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}