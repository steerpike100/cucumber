package implementation;

public class Account {

    private int openingBalance = 0;
    private int received = 0;
    private int newBalance = 0;

    public Account(int openingBalance) {
        this.openingBalance = openingBalance;
    }

    public void withdraw(int withdrawal){
        newBalance = openingBalance - withdrawal;
    }

    public void received(int receive){
        this.received = receive;
    }

    public int remaining(){
        return newBalance;
    }
}

