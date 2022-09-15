import java.util.*;
public class UseBase64DeDemo {
    public static void main (String[] args) {
        byte[] output = Base64.getDecoder().decode("5Lit");
        System.out.println(Arrays.toString(output));
    }
}