package ru.shumilin.connection;


public class ConnectionLostException extends Exception {
    public ConnectionLostException() {
        super();
    }
    public ConnectionLostException(String message) {
        super(message);
    }
    public ConnectionLostException(Throwable cause) {super(cause);}
    public ConnectionLostException(String message, Throwable cause) {super(message, cause);}

}
