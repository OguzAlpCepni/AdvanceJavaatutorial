public class Thread2 implements Runnable{
    MathUtils matUtils;
    public Thread2(MathUtils mathUtils){
        this.matUtils = mathUtils;
    }
    public void run() {
        try {
            matUtils.getMultiples(3);
        } catch (Exception e) {
            System.out.println("Exception raised " + e);
        }
    }
}