public class Main {
    public static void main(String[] args) {

       DeadLock deadLock = new DeadLock();
       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               deadLock.Thread1();
           }
       });
       Thread  thread2 = new Thread(new Runnable() {
           @Override
           public void run() {
               deadLock.Thread2();
           }
       });
       thread.start();
       thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deadLock.threadOver();


    }
}