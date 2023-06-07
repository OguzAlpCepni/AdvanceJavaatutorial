import Log.BaseLogger;

public class OracleDatabaseManagement extends BaseDatabaseManagement{

    BaseLogger baseLogger;

    public OracleDatabaseManagement(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    @Override
    public void connect() {
        /*  String url = "jdbc:mysql://localhost:3306/veritabani_adi"; // Veritabanı adresi ve portu
        String username = "kullanici_adi"; // Veritabanı kullanıcı adı
        String password = "sifre"; // Veritabanı şifresi
        */
        System.out.println("Oracle database ile baglanti saglandi");
        baseLogger.Log("Oracle database connected");

    }

    @Override
    public void disConnect() {
         /*try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("MySQL veritabanı bağlantısı kapatıldı.");
            }
        } catch (SQLException e) {
            System.out.println("MySQL veritabanı bağlantısı kapatma hatası: " + e.getMessage());
        }

         */
        System.out.println(" Oracle ile baglanti koparildi");
        baseLogger.Log(" Oracle ile baglantı kapandi");

    }

    @Override
    public void add() {

    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {

    }
}
