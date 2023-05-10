package ThreadExample1;

public class Printer extends Thread{

    private String name;

    @Override
    public void run() {
        System.out.println(name + "calisiyor... ");

        for(int i = 0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye ugradi");
            }
        }
        System.out.println(name+" isini bitirdi...");
    }

    public Printer(String name) {
        this.name = name;
    }
}
