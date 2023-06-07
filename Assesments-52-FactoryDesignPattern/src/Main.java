public class Main {
    public static void main(String[] args) {
        NotifiyFactory notifiyFactory = new NotifiyFactory();
        INotify notify = notifiyFactory.createNotify("SMS");

        notify.sendNotification(new User());
    }
}