import java.util.*;
import java.util.stream.*;

public class CollectProblem {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student(2, 3, "小明", 80),
                new Student(3, 1, "小王", 90),
                new Student(1, 2, "小强", 100),
                new Student(3, 1, "小红", 90),
                new Student(1, 2, "小黄", 100),
                new Student(2, 3, "小黑", 80),
                new Student(1, 2, "小军", 100),
                new Student(2, 3, "小乔", 80),
                new Student(3, 1, "小林", 90));
        Map<Integer, Map<Integer, List<Student>>> studentByGradeAndClass 
                = studentStream.collect(
                        Collectors.groupingBy(Student::getGradeId,
                        Collectors.groupingBy(Student::getClassId)));
        studentByGradeAndClass.forEach((k, m) -> {
            System.out.print("Grade" + k + " ");
            m.forEach((key, value) -> System.out.println("Class" + key + " = " + value));
        });
    }
}

class Student {
    private int gradeId;
    private int classId;
    private String name;
    private int score;

    public Student(int gradeId, int classId, String name, int score) {
        this.gradeId = gradeId;
        this.classId = classId;
        this.name = name;
        this.score = score;
    }

    public int getGradeId() {
        return gradeId;
    }

    public int getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + " " + "Score: " + getScore();
    }
}