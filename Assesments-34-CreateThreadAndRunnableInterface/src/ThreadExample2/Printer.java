package ThreadExample2;

public class Printer implements  Runnable{
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "calisiyor... ");

        for(int i = 0;i<10;i++){

            try {
                System.out.println(name+" yaziyor "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye ugradi");
            }
        }
        System.out.println(name+" isini bitirdi...");
    }
}
