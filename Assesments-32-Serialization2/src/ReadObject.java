import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ogrenciler.txt"))){
           Student[] students = (Student[]) objectInputStream.readObject();
            ArrayList<Student> studentArrayList = (ArrayList<Student>) objectInputStream.readObject();
            System.out.println("*********************************************************");
            for (Student student : students){
                System.out.println(student);
                System.out.println("----------------------------------------------------");
            }
            System.out.println("*********************************************************");
            for (Student student: studentArrayList){
                System.out.println(student);
                System.out.println("----------------------------------------------------");
            }
            System.out.println("*********************************************************");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
