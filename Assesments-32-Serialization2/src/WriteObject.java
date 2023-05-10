import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        Student student1 = new Student("oguz alp",12345,"computer enginier");
        Student student2 = new Student("yaren",7522,"lawyer");
        Student student3 = new Student("ahmet",1567,"architech");

        Student[] students= {student1,student2,student3};
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(students));

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenciler.txt"))){
            outputStream.writeObject(students);
            outputStream.writeObject(studentArrayList);

        } catch (FileNotFoundException e) {
            System.out.println("not found file");
        } catch (IOException e) {
            System.out.println("dosya acılırken IOException olustu");
        }
    }
}
