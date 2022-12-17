public class Thread1 extends Thread{
    MathUtils matUtils;
    public Thread1(MathUtils mathUtils){
        this.matUtils = mathUtils;
    }
    public void run(){
        try {
            matUtils.getMultiples(2);
        }catch (Exception e){
            System.out.println("Exception raised "+e);
        }
    }
}