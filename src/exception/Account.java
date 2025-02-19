package exception;

import java.io.IOException;

public class Account {
    private int balence;
    public void deposit(float value) throws IOException {
        if (value<=0){
            throw new IOException();
        }

    }
    public void withDraw(float value) throws AccountException {
        if(value>balence){
//            Exception.InsufficientFundsException insufficientFundsException=new Exception.InsufficientFundsException();
//            Exception.AccountException accountException=new Exception.AccountException();
//            accountException.initCause(insufficientFundsException);
//            throw accountException();
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
