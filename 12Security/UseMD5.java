import java.math.*;
import java.security.*;

public class UseMD5 {
    public static void main (String[] args) throws Exception{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("hello".getBytes("UTF-8"));
        md.update("world".getBytes("UTF-8"));
        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));
    }
}