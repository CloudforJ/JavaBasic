public class ReflectionDemo12 {
    public static void main(String[] args) {
        Class s = Integer.class.getSuperclass();
        Class[] is = s.getInterfaces();
        for (Class i :
             is) {
            System.out.println(i);
        }
    }
}
