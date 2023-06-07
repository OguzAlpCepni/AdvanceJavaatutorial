import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaoku(){
        try {
            FileInputStream fileInputStream = new FileInputStream("marş.mp3");
            int read;
            while((read = fileInputStream.read()) !=-1){
                icerik.add(read);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void copy(String filename){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            for (int value : icerik) fileOutputStream.write(value);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        dosyaoku();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("marş2.mp3");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("marş3.mp3");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("marş4.mp3");
            }
        });


        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        long finish = System.currentTimeMillis();
        System.out.println("3 dosya kopyalanması su kadar :"+((finish-start)/1000)+"saniye");

    }
}