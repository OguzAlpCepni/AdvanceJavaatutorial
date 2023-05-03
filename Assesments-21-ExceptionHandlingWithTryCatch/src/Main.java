public class Main {
    public static void main(String[] args) {

        // int a = 30/0;  // Unchecked Exception
        // int [] a = {1,2,3,4,5};
        //System.out.println(a[6]); // arithmetick Exception

        try{
            int b = 30/0; //ArithmeticException
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);


        }
        catch (ArithmeticException e){
            System.out.println("number cannot be divided by zero ");
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" array boyunu astiniz");

        }
        System.out.println("**************************************");
    }
}