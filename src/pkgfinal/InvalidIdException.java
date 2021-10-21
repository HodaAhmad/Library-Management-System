package pkgfinal;

public class InvalidIdException extends Exception {

    String msg;

    public InvalidIdException() {
        msg = "invalid ID input";
    }
}
