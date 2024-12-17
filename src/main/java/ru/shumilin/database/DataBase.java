package ru.shumilin.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {
    private final static int SIZE = 10;
    private final int maxConnection;
    private int connections;
    private List<String> data = new ArrayList<>();

    public DataBase(int maxConnection) {
        this.maxConnection = maxConnection;

        Random rand = new Random();

        for(int i = 0; i < SIZE; i++) {
            data.add(String.valueOf(rand.nextInt()));
        }
    }

    public Connection getConnection(){
        connections++;
        return connections >= maxConnection ? null : new Connection(this);
    }

    public static class Connection {
        private final DataBase db;

        public Connection(DataBase db) {
            this.db = db;
        }

        public String getData(int index){
            return index > db.data.size() || index < 0 ? null : db.data.get(index);
        }

        public void setData(String data){
            db.data.add(data);
        }
    }
}
