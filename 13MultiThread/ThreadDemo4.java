public class ThreadDemo4 {
    public static void main (String[] args) {
        System.out.println("Main start...");
        Thread t = new Thread() {
          public void run() {
              System.out.println("thread run...");
              System.out.println("thread end...");
          }  
        };
        t.start();
        System.out.println("main end...");
    }
}