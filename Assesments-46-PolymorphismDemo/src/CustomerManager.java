public class CustomerManager {
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }

    public void add(){
        // code
        System.out.println("customer added");
        baseLogger.Log("logladım kral ");


    }
}
