import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        /*
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is starting ");
                Random random = new Random();
                int sure = random.nextInt(1000)+2000;
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread exit");
            }
        });
        executorService.shutdown();

         */
        Future<?> future = executorService.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("thread is starting ");
                Random random = new Random();
                int sure = random.nextInt(1000)+2000;
                if(sure >3000 ) throw new IOException("Thread cok uzun süre uyudu");
                try {
                    Thread.sleep(sure);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("thread exit");
                return sure ;
            }
        });
        executorService.shutdown();
        try {
            System.out.println("return value : "+ future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }
    }
}