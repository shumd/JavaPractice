package ru.shumilin.connection;

import lombok.Getter;

import java.util.Random;

public class Connection implements AutoCloseable{
    String host;
    @Getter
    boolean isClose;



    public Connection(String host) {
        this.host = host;
    }

    @Override
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
