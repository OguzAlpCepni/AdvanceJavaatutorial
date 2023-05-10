import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try catch sayısını ve kolaylık sağlıyor diye böyle bir başlık açtım
        try(FileWriter file = new FileWriter("dosya.txt")){//;FileWriter file2 = new FileWriter("dosya adını yaz")){

        }catch (IOException exception){
            System.out.println("An error occurred while creating the file");
        }
    }
}