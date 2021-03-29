package lab6.exceptii.exercitiu.exception;

public class UnauthorizedException extends RuntimeException{

    private int code;
    protected int codeProtected;

    public UnauthorizedException(String message, int code) {
        super(message);
        this.code = code;
        this.codeProtected = code;
    }

    public int getCode() {
        return code;
    }

    // nu avem nevoie de set...setam code in constructor iar apoi nu mai vrem sa fie modificat
//    public void setCode(int code) {
//        if (code < 0 ) {
//            // do something
//        }
//        this.code = code;
//    }
}
