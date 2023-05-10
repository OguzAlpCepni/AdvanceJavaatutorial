import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducesConsumer {

    Random random = new Random();
    Object lock = new Object();

    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10;

    public void Produce(){
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock) {
                if (queue.size() == limit) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer uretiyor : " + value);
                lock.notify(); // uyuyan bir consume varsa uyanıcak
            }
        }
    }
    public void Consume(){
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Integer value = queue.poll();
                System.out.println("consumer tuketiyor : "+value);
                System.out.println("queue size : "+queue.size());
                lock.notify(); // bekleyen bir producer varsa uyandır
            }
        }
    }
}
