import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try(Scanner scanner =new Scanner(new BufferedReader(new FileReader("ogrenciler.txt"))) ){
            while(scanner.hasNextLine()){
                //System.out.println("okunan satir "+scanner.nextLine());
                String ogrenciBilgisi = scanner.nextLine();
                String[] arr =  ogrenciBilgisi.split(",");
                if ((arr[1].equals("Bilgisayar Mühendisligi"))){
                    System.out.println("ogrenci bilgisi :"+ogrenciBilgisi);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}