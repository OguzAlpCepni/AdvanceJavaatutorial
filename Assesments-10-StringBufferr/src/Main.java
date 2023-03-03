public class Main {
    public static void main(String[] args) {

    StringBuffer stringBuffer = new StringBuffer("Hello world");
        System.out.println("original string :"+stringBuffer );

        stringBuffer.replace(0,7,"selam");
        System.out.println("change string :"+ stringBuffer);

        stringBuffer.delete(0,5);
        System.out.println("change string :"+stringBuffer);

        String str = stringBuffer.toString();
        System.out.println("conver String "+str);
    }
}