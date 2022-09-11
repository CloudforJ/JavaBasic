public class StringCmp {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "Hello".toLowerCase();
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = "Hello";
        System.out.println(s1.equalsIgnoreCase(s4));

        String s5 = String.valueOf(123);
        System.out.println(s5);

        int n = Integer.parseInt("123");
        System.out.println(n);

        char[] cs = "Hello".toCharArray();
        System.out.println(cs);



        String s = new String(cs);
        cs[0] = 'x';
        System.out.println(s);
        System.out.println(cs);

    }
}