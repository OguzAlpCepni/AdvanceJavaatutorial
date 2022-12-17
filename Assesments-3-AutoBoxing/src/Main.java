public class Main {

    public static void main(String[] args) {

        int i = 10;




        // auto-Unbox

        Integer obj = Integer.valueOf(i);

        System.out.println("value of Integer  obj : "+ obj);




        // autobox

        int i1=obj;

        System.out.println("value of i1 : "+i1);




        //Autobox

        Character charObj= 'a';

        //Auto-Unbox

        char ch= charObj;

        System.out.println("value of ch : "+ch);

        System.out.println("value of CharObj : "+charObj);

    }

}