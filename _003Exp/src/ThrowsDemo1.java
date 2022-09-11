public class ThrowsDemo1 {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }
    }

    static void process1() {
        process2(null);
    }

    static void process2(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        Integer.parseInt(s);
    }
}
