import java.util.Scanner;

public class SomeBankAccounts {
    public static void deposit(BankAccount[] allAccounts, int i, int amount){
        if ( i >= allAccounts.length || ! allAccounts[i].deposit(amount)){
            System.out.println("Deposit unsuccessful.");
        }
    }

    public static void withdraw(BankAccount[] allAccounts, int i, int amount){
        if (i >= allAccounts.length || ! allAccounts[i].withdraw(amount)){
            System.out.println("Deposit unsuccessful.");
        }
    }

    public static void transfer(BankAccount[] allAccounts, int fromNum, int toNum , int amount){
        if (fromNum < allAccounts.length &&
        toNum < allAccounts.length && allAccounts[fromNum].withdraw(amount)){
            allAccounts[toNum].deposit(amount);
        }else{
            System.out.println("Transfer unsuccessful");
        }
    }

    public static BankAccount initial(int index){
        Scanner keyboard = new Scanner(System.in);
        System.out.printf( "Enter name for account #%d: ", index );
        String name = keyboard.nextLine();
        System.out.printf( "Enter name for account #%d: ", index );
        int dep = Integer.parseInt(keyboard.nextLine());
        return new BankAccount(name, dep);
    }

    public static void chooseAction(BankAccount[] allAccounts){
        System.out.println( "------" );
        for ( int i = 0; i < allAccounts.length; i ++ )
            {
            System.out.printf( "%2d: %s has the balance of %s%n", i,
                    allAccounts[ i ].getName(),
                    allAccounts[ i ].getBalanceString() );
            }
        System.out.println( "-----Select action" );
        System.out.println( "1. Deposit to an Account" );
        System.out.println( "2. Withdrawal from an Account" );
        System.out.println( "3. Transfer Between Accounts" );
        System.out.println( "4. Quit" );
        System.out.print("Enter action: ");
        }

    public static void main(String[] args){
        int pos1, pos2, amm;
        char c;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of accounts: ");
        int n = keyboard.nextInt();
        BankAccount[] accounts = new BankAccount[n];
        for(int i = 0; i < n; i++){
            accounts[i] = initial(i);
        }
        do{
            chooseAction(accounts);
            c = keyboard.next().charAt(0);
            switch (c) {
                case ('1') -> {
                    System.out.print("Enter position of your account: ");
                    pos1 = keyboard.nextInt();
                    System.out.print("Enter amount of deposit: ");
                    amm = keyboard.nextInt();
                    deposit(accounts, pos1, amm);
                }
                case ('2') -> {
                    System.out.print("Enter position of your account: ");
                    pos1 = keyboard.nextInt();
                    System.out.print("Enter amount of withdraw: ");
                    amm = keyboard.nextInt();
                    deposit(accounts, pos1, amm);
                }
                case ('3') -> {
                    System.out.print("Enter position of withdraw account: ");
                    pos1 = keyboard.nextInt();
                    System.out.print("Enter position of deposit account: ");
                    pos2 = keyboard.nextInt();
                    System.out.print("Enter amount of transfer: ");
                    amm = keyboard.nextInt();
                    transfer(accounts, pos1, pos2, amm);
                }
                default -> System.out.println("Enter correct number.");
                case ('4') -> System.out.print("Thank you\nGoodbye!\n");
            }
        }while(c != '4');
    }
}
