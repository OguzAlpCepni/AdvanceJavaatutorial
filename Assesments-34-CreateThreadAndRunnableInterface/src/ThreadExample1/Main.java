public class Main {
    public static void main(String[] args) {

    Printer printer1 = new Printer("printer1");
    Printer printer2 = new Printer("printer 2");

    printer1.start();
    printer2.start();

        System.out.println("main thread calisiyor");
    }
}