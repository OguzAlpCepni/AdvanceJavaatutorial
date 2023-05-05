import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;


        try {
            fos = new FileOutputStream("dosya.txt",true);

            //byte [] arr = {101,12,14,21};
            //fos.write(arr);
            String s = "oguzalp cepni";
            byte[] arr = s.getBytes();
            fos.write(arr);

        }catch (FileNotFoundException exception){

            System.out.println("file not found exception");
        }catch (IOException exception){
            System.out.println("The file encountered an error while closing");
        } finally {
            try{
                fos.close();
            }catch (IOException ioException){
                System.out.println("dosya kapanırken hata oldu");
            }
        }
    }
}