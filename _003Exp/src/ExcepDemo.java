import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExcepDemo {
    public ExcepDemo() {
    }

    public static void main(String[] var0) {
        byte[] var1 = toGBK("中文");
        System.out.println(Arrays.toString(var1));
    }

    static byte[] toGBK(String var0) {
        try {
            return var0.getBytes("GBK");
        } catch (UnsupportedEncodingException var2) {
            System.out.println(var2);
            return var0.getBytes();
        }
    }
}