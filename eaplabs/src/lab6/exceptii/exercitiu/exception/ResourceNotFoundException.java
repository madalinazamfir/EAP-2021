package lab6.exceptii.exercitiu.exception;

import lab6.exceptii.exercitiu.dto.User;

public class ResourceNotFoundException extends RuntimeException{

    private int code;

    public ResourceNotFoundException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
