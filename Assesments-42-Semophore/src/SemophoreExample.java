import java.util.concurrent.Semaphore;

public class SemophoreExample {
    private Semaphore semaphore= new Semaphore(3);
    public void ThreadStart(int id){
        try {
            semaphore.acquire();// bu kod bloguna ne sartlarda girebilir degeri 0 ise bundan sonra giremez


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread is starting Id : "+id );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread cikiyor id : "+id);
        semaphore.release();// diger threadler girebilsin diye degiskenin degerini arttıriyor

    }
}
