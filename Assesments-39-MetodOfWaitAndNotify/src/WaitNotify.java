import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();
    public void Thread1fonk(){
        synchronized (lock){                            // onjemiz üzerinde bir tane anahtara sahip oldu
            System.out.println("thread 1 calisiyor ");
            System.out.println("thread1 thread2'nin kendisini uyandırmasını bekliyor ");
            try {
                lock.wait();    // bende burda wait yapıcam anahtarı teslim edicem beni başka bir thread uyandırana kadar burada beklicem
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 uandı devam ediyor ");

        }
    }
    public void Thread2Fonk(){
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock){
            System.out.println("Thread 2 calisiyor ");
            System.out.println("devam etmek icin bir tusa basin");
            scanner.nextLine();
            lock.notify();// benim isim bitti sen calisabilirsin
            System.out.println("thread1 uyandırıldı 2 sn bekle ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // notify yapılan thread öncelikle kendi işlerini bitirip ondan sonra diğer thredin calismanı izin veriır
        }

    }
}
