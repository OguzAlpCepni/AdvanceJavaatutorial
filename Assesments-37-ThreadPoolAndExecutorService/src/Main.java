import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
       /* Thread thread1 = new Thread(new Worker("1",1));
        Thread thread2 = new Thread(new Worker("2",2));
        Thread thread3 = new Thread(new Worker("3",3));
        Thread thread4 = new Thread(new Worker("4",4));
        Thread thread5 = new Thread(new Worker("5",5));
        System.out.println("all work has been delivered");
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // thread 1 ve thread 2 bitmeden devam etmicek
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread5.start();

        try {
            thread5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("all work done");
        */

        ExecutorService executorService = Executors.newFixedThreadPool(5); // 2 threadin calismasını thread pool ile sagladık
        for(int i = 1 ; i<=5; i++){
            executorService.submit(new Worker(String.valueOf(i),i))  ; //5 tane threade 5 tane task atamasi yaptik
        }
        executorService.shutdown(); //bu threadlerin işi bitene kadar bu execureyi kapatmıcam
        System.out.println("all work has been delivered");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS); // ben burada sadece belli bir süre beklerim
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("all works done");
    }
}