public class Main {
    public static void main(String[] args) {

        Colors colors = Colors.RED;
        System.out.println("red Enum name : "+colors.name());
        System.out.println("red Enum Value : "+colors.getValue());

        for(Colors color : Colors.values()){
            System.out.println(" amk SAU "+color.getValue());
        }
    }
}