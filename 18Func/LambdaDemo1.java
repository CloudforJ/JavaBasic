import java.util.Arrays;
public class LambdaDemo1 {
    public static void main (String[] args) {
        String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, LambdaDemo1::cmp);
        System.out.println(String.join(", ", array));
    }
    
    static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }
}