public class ThreadSafe {
    private int count = 0;

    public synchronized void Increment(){
        count++;
    }
    public void ThreadRun() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<5000;i++) Increment();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<5000;i++) Increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join(); // ben bu threadi olustuyorum ama sen beni bir bekle
        thread2.join(); // thread1 ve 2 main threade diyorki bizim calismamizi bekleyeceksin
                        // kısaca buradaki islemler bitmeden alttaki yazma islemine gecmicek
        System.out.println("count degerinin degiskeni : "+count);
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.ThreadRun();

    }
}
