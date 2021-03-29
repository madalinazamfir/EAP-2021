package lab6.exceptii.exercitiu.exception;

public class WrongCredentialsException extends UnauthorizedException{

    public WrongCredentialsException(String message, int code) {
        super(message, code);
    }
}
