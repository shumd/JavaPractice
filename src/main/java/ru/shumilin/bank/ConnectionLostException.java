package ru.shumilin.bank;


public class ConnectionLostException extends Exception {
    public ConnectionLostException() {
        this("Lost connection");
    }
    public ConnectionLostException(String message) {
        super(message);
    }
}
