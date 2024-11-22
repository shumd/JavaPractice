package ru.shumilin.connection;

import lombok.SneakyThrows;
import ru.shumilin.other.ClosedResourceException;

import java.util.Random;

public class Connection {
    String host;
    boolean isClose;

    public Connection(String host) {
        this.host = host;
    }

    public void close(){
        isClose = true;
    }

    public String getData() throws ConnectionLostException{
        if(isClose){
            throw new ClosedResourceException();
        }

        Random r = new Random();
        if(r.nextBoolean()){
            throw new ConnectionLostException();
        }else {
            return "test connection";
        }
    }
}
