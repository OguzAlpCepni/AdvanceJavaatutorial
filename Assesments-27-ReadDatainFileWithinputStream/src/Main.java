import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;

        try {
            fis= new FileInputStream("dosya.txt");
           // System.out.println("okunana karakter :"+(char)fis.read());
           // fis.skip(5);
           // System.out.println("okunan karakter "+(char)fis.read());

            int value;
            String s ="";
            //while((value =fis.read()) !=-1) s+=(char)value;
            //System.out.println("dosya icerigi : "+s);
            int say =0;
            fis.skip(5);
            while ((value=fis.read()) != -1){
                s += (char)value;
                say++;
                if(say == 10)break;
            }
            System.out.println("dosyanin 5. kelimesinden sonra 10 karakte okundu :"+s);

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException( "dont found file");
        }catch (IOException e){
            System.out.println("dosya okunurken hata olustu");

        }
        finally {
            try{
                if(fis != null) {
                    fis.close();
                }
            }catch (IOException e){
                throw new IOException("dosya kapatilirken bir hata olustu");
            }
        }
    }
}