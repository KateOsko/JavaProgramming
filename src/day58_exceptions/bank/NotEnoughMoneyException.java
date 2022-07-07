package day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException {


    public NotEnoughMoneyException(){
        super("Not Enough Money in the account");
    }

    public NotEnoughMoneyException (String msg){
        super(msg);
    }
}
