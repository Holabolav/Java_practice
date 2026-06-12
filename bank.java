class BankAccount{
    private int Balance;

    public void deposit(int amount){
        Balance += amount;
        
    }

    public void withdraw(int amount){
        if(amount<0){
            System.out.println("Invalid Amount");
        
        }
        else if(amount>Balance){
            System.out.println("Insufficient funds");
        }
        else{
            Balance = Balance - amount;
        }


    }
}


public class bank {
    public static void main(String[] args) {
        bank b = new Bank();
        Bank b2 = new BAnk();
        b.deposit(-5000);
        b.withdraw(5000);
        b2.deposit(15000);
        b2.withdraw(5000);

        System.out.println(b.getBalance());
        System.out.println(b2.getBalance());
    }
}
