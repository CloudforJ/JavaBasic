import java.net.*;
import java.nio.charset.*;

public class UseEncoderDemo {
    public static void main (String[] args) {
        String encoded = URLEncoder.encode("中文！", StandardCharsets.UTF_8);
        System.out.println(encoded);
    }
}