package Log;

public class EmailLogger extends BaseLogger{
    @Override
    public void Log(String message){
        System.out.println("Email log message :"+ message);
    }
}
