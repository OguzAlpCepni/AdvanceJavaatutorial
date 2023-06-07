public class NotifiyFactory {
    public INotify createNotify(String notifyType){
        if(notifyType=="SMS"){

        return  new SmsNotify();
        }
        else if(notifyType=="MAIL"){
            return new MailNotify();
        }

        return null;
    }
}
