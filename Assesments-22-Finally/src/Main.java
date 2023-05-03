public class Main {
    public static void main(String[] args) {


        try {
            String s = "oguz";
            System.out.println(s.hashCode());
        }catch (NullPointerException e){
            System.out.println("Null pointer exception");

        }
        finally {
            System.out.println("finally start");
        }
    }
}