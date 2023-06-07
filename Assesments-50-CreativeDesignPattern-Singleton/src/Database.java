public class Database {
    private static Database database;
    private static Object synchoizedObject = new Object();

    private Database(){

    }
    public static Database getInstance(){
        if(database==null){
            synchronized (synchoizedObject){
                if(database==null){
                    database=new Database();
                }
            }
        }
        return database;
    }
}
