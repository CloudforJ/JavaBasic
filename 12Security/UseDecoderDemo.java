import java.net.*;
import java.nio.charset.*;

public class UseDecoderDemo {
    public static void main (String[] args) {
        String decoded = URLDecoder.decode("%E4%B8%AD%E6%96%87%EF%BC%81", StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}