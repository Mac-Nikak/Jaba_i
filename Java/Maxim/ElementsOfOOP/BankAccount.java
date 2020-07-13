public class BankAccount {
    private String name;
    private int balance;
    final static int max = (int) Math.pow(10,6) * 2;
    public BankAccount(String name, int balance){
        this.name = name;
        this.balance = Math.max(1,balance);
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getBalanceString(){
        return String.format("$%,d.%02d", balance/100, balance %100);
    }

    public boolean deposit(int x){
        if (x < 0){
            return false;
        }else{
            balance += x;
            return true;
        }
    }

    public boolean withdraw(int y){
        if (y < 0 || y > balance ){
            return false;
        } else{
            balance -= y;
            return true;
        }
    }
}
