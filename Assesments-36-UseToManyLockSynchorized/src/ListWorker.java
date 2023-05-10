import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListWorker {

    Random random = new Random();

    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

    private Object lock1 =  new Object();
    private Object lock2 = new Object();

    public  void addValueList1() throws InterruptedException {
            synchronized (lock1) {


            Thread.sleep(1);
            arrayList1.add(random.nextInt(100));
            }
        }
    public  void addValueList2() throws InterruptedException {
        synchronized (lock2) {


            Thread.sleep(1);
            arrayList2.add(random.nextInt(100));
        }
    }
    public void AssignValue() throws InterruptedException {
            for (int i = 0;i<1000;i++){
                addValueList1();
                addValueList2();
            }
    }

    public void ToRun() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AssignValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AssignValue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("size of list1 : "+arrayList1.size()+"size of list2 : "+arrayList2.size());
        long finish = System.currentTimeMillis();
        System.out.println("passing time : "+(finish-start));

    }
}

