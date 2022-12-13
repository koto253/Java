public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  // add check balance method
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  // add a deposit method that return nothing and takes a parameter
  public void deposit(int amountToDeposit) {
    balance = balance + amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }
  public int withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    return amountToWithdraw;
  } 

  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
  
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
  }       
}

