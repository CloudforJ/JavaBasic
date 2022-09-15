public class ThreadDemo3 {
    public static void main (String[] args) {
        Thread t = new Thread(() -> {
           System.out.println("start new thread"); 
        });
        t.start();
    }
}