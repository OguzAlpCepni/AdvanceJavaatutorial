public class Main {
    public static void main(String[] args) {
        ProducesConsumer producesConsumer = new ProducesConsumer();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                producesConsumer.Produce();
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                producesConsumer.Consume();
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