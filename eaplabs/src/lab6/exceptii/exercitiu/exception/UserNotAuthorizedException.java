package lab6.exceptii.exercitiu.exception;

public class UserNotAuthorizedException extends UnauthorizedException{

    public UserNotAuthorizedException(String message, int code) {
        super(message, code);
    }
}
