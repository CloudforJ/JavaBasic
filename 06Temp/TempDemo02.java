import java.util.Arrays;
public class TempDemo02 {
    public static void main (String[] args) {
        /* code */
        Person02[] ps = new Person02[] {
            new Person02("Bob", 61),
            new Person02("Alice", 88),
            new Person02("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person02 implements Comparable<Person02> {
    String name;
    int score;
    Person02(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person02 other) {
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return this.name + " " + this.score;
    }
}