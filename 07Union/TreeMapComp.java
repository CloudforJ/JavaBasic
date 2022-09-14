import java.util.*;

public class TreeMapComp {
    public static void main (String[] args) {
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        
        for (Person p : map.keySet()) {
            System.out.println(p);
        } 
        System.out.println(map.get(new Person("Bob")));
    }
}

class Person {
    public String name;
    
    Person(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "{Person: " + name + "}";
    }
}