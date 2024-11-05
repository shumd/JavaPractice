package IDE_ClassWork;

import lombok.Getter;

public class ConnectionLostException extends Exception {
    @Getter
    private BankAccount bankAccount;

    public ConnectionLostException(BankAccount bankAccount) {
        super("Lost connection");
        this.bankAccount = bankAccount;
    }
}
