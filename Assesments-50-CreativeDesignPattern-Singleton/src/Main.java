public class Main {
    public static void main(String[] args) {
        Database firstInstanceRequest = Database.getInstance();
        Database sezondInstanceRequest = Database.getInstance();

        boolean isEquals = firstInstanceRequest==sezondInstanceRequest;

        System.out.println("Database referance is equals:  "+ isEquals);
    }
}