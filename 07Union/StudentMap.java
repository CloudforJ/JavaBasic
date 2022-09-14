import java.util.Map;
import java.util.HashMap;

public class StudentMap {
    public static void main (String[] args) {
        Student s = new Student("Xiao Ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("xiao ming", s);
        Student target = map.get("xiao ming");
        System.out.println(target == s);
        System.out.println(target.score);
        Student another = map.get("bob");
        System.out.println(another);
    }
}

class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}