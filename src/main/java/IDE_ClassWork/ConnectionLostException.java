package IDE_ClassWork;


public class ConnectionLostException extends Exception {
    public ConnectionLostException() {
        this("Lost connection");
    }
    public ConnectionLostException(String message) {
        super(message);
    }
}
