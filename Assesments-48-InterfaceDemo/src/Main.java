public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new OracleDatabaseDal();
        //customerManager.customerDal = new MySqlDatabaseDal();
        customerManager.add();
    }
}