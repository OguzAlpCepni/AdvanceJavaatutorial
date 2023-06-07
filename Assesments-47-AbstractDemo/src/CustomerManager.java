public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager; // strategy design pattern
    public void getCustomer(){
    baseDatabaseManager.getData();
    }
}
