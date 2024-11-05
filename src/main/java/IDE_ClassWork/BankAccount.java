package IDE_ClassWork;

import java.util.Random;

public class BankAccount {
    public int money;

    public static void updateDatabase() throws ConnectionLostException{
        Random r = new Random();
        if(r.nextBoolean()){
            throw new ConnectionLostException();
        }
    }

    public void transferMoney(int amount, BankAccount to) throws ConnectionLostException{
        money -= amount;
        to.money += amount;
        updateDatabase();
    }
}
