package Assignments;

public class BankAccount
{
	String accountHolderName;
	String bankName;
	double accountBalance;
	
public BankAccount(String accountHolderName,String bankName,double initialBalance) {
		this.accountHolderName=accountHolderName;
		this.bankName=bankName;
		this.accountBalance=initialBalance;
	}
	
public double getBalnce() {
	return accountBalance;
}

public void deposit(double amount) {
	  if (amount > 0)
	  {
          accountBalance = accountBalance + amount;
          System.out.println("Deposited: " + amount + " into " + accountHolderName +"'s"+" account");
      } 
	
  }

public void withdraw(double amount) {
    if (amount > 0 && amount <= accountBalance) 
    {
        accountBalance = accountBalance-amount;
        System.out.println("Withdrawn: " + amount + " from " + accountHolderName +"'s"+" account");
    } 
    
}

    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("DOLLY", "ICICI", 5000.0);
        BankAccount account2 = new BankAccount("RASHMI", "HDFC", 2000.0);
        BankAccount account3 = new BankAccount("SHUBHAM", "SBI", 4000.0);

       
        account1.deposit(500.0);
        account1.withdraw(100.0);

        account2.deposit(1000.0);
        account2.withdraw(500.0);

        account3.deposit(1000.0);
        account3.withdraw(300.0);

        System.out.println("Below are the total balance of each account");
        System.out.println("DOLLY:"+ account1.getBalnce());
        System.out.println("RASHMI:"+ account2.getBalnce());
        System.out.println("SHUBHAM:"+ account3.getBalnce());
    }
}


