import java.io.*;
public class Main {

    public static void main(String[] args) {
        Car car =  new Car("Audi","A3");
        try {
            FileOutputStream outputFile = new FileOutputStream("Araba.txt");
            ObjectOutputStream outputStream= new ObjectOutputStream(outputFile);// çıktıyı vericek dosya
            outputStream.writeObject(car);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("Araba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Car newCar = (Car)objectInputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}