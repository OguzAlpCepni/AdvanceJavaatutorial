public class Main {
    public static void main(String[] args) {
        WaitNotify waitNotify = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.Thread1fonk();

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotify.Thread2Fonk();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}