import java.io.IOException;

public class InvalidAgeException extends IOException {

    public InvalidAgeException(String message){
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("error of invalid age");
    }

}
