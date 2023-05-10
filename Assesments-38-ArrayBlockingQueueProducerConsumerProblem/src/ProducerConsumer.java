import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {
    Random random = new Random();

    ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(10);

    public void Produce(){
        // producer threadi calistiricak
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer value = random.nextInt(100);
                arrayBlockingQueue.put(value);// queue doldugu zaman threadi beklemeye alıak
                System.out.println("Producer to produce : "+ value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public void Consume(){
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Integer value = arrayBlockingQueue.take();
                System.out.println("Consumer is comsumering : "+value);
                System.out.println("Size of Queue : "+arrayBlockingQueue.size());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
