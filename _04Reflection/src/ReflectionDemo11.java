public class ReflectionDemo11 {
    public static void main(String[] args) {
        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class i:
             is) {
            System.out.println(i);
        }
    }
}
