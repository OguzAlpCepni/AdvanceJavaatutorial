import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome to gym");

        String gym = "true moves :\n"
                +"burpee\n"
                +"pushup\n"
                +"situp\n"
                +"squat\n";
        System.out.println(gym);

        System.out.println("please create a gym plan");
        System.out.println("number of burpe");
        int burpe = scanner.nextInt();
        System.out.println("number of pushup");
        int pushup = scanner.nextInt();

        System.out.println("number of situp");
        int situp = scanner.nextInt();

        System.out.println("number of squat");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Gym gym1 = new Gym(burpe,pushup,situp,squat);
        System.out.println("gym is starting");
        try(FileWriter writer = new FileWriter("log.txt")) {
            writer.write("gmy plan");
            writer.write("burpe number"+gym1.getBurpee());
            writer.write("pushup number"+gym1.getPushup());
            writer.write("situp number"+gym1.getSitup());
            writer.write("squat squat"+gym1.getSquat());


            int i = 0;
            while (gym1.idmanBittiMi() == false) {

                System.out.print("Hareket TÃ¼rÃ¼(Burpee,Pushup,Situp,Squat) : ");
                String tur = scanner.nextLine();
                System.out.print("Bu hareketten kaÃ§ tane yapacaksÄ±nÄ±z ? : ");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                gym1.hareketYap(tur, sayi);

                writer.write(i+" . islem ----------->hareket "+tur + " sayi :" + sayi + "\n");
                i++;
            }


            System.out.println(" gym complated");
        }catch (IOException exception){
            System.out.println("file failed");
        }


    }
}