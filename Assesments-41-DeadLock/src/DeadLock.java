import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    private Hesap hesap1 = new Hesap();
    private Hesap hesap2 = new Hesap();
    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void CheckhLock(Lock lock1, Lock lock2){
        boolean lock1EldeEdildi =false;
        boolean lock2EldeEdildi =false;
        while (true){
            lock1EldeEdildi=lock1.tryLock();
            lock2EldeEdildi=lock2.tryLock();
            if (lock1EldeEdildi==true&&lock2EldeEdildi==true)return;

            if (lock1EldeEdildi==true)lock1.unlock();
            if (lock2EldeEdildi==true)lock2.unlock();
        }

    }
    public void Thread1(){
        CheckhLock(lock1,lock2);

        for (int i = 0; i < 5000 ; i++) {

            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));

        }
        lock1.unlock();
        lock2.unlock();

    }
    public void Thread2(){
        CheckhLock(lock2,lock1);
        for (int i = 0; i < 5000 ; i++) {

            Hesap.paraTransferi(hesap1, hesap2, random.nextInt(100));

        }
        lock2.unlock();
        lock1.unlock();
    }
    public void threadOver(){
        System.out.println("Hesap1 Bakiye : " + hesap1.getBakiye() + " Hesap2 Bakiye : " + hesap2.getBakiye());

        System.out.println("Toplam Bakiye : " + (hesap1.getBakiye() + hesap2.getBakiye()));

    }


}
