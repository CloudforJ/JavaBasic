import java.math.*;
import java.security.*;

public class UseSHA1 {
    public static void main (String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));
    }
}