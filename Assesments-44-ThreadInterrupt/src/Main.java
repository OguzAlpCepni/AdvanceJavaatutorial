public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thrad starting ");
                for(int i = 1;i<10;i++){
                    System.out.println("thread is writing :"+i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("uykum "+(i+1)+".ci saniyesindeyim...");
                    } catch (InterruptedException e) {
                        System.out.println("uyku bolundu");
                    }
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();// yarıda kes
    }
}