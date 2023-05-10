import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.Produce();
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                producerConsumer.Consume();
            }
        });
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}