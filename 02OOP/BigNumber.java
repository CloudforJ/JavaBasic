import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("999999999").pow(99);
        System.out.println(bi);

        float f = bi.floatValue();
        System.out.println(f);
    }
}