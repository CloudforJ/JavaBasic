public class PersonDemo {
    public static void main(String[] args) {
        Person1 ming = new Person1();
        ming.setName("xiaoming");
        ming.setAge(18);
        System.out.println(ming.getName() + " " + ming.getAge());
    }
}

class Person1 {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}