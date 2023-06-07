import Log.BaseLogger;
import Log.DatabaseLogger;

public class Main {
    public static void main(String[] args) {
        BaseDatabaseManagement baseDatabaseManagement = new MySqlDatabaseManagement(new DatabaseLogger());
        baseDatabaseManagement.connect();
        baseDatabaseManagement.disConnect();

    }
}