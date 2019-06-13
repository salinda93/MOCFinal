package exception.handle.q3;

public class Account {
   private double balance;
   private int accNo;
   
   public Account(int accNo) {
      this.accNo = accNo;
   }
   
   public void deposit(double amount) {
      balance += amount;
   }
   
   public void withdraw(double amount) throws InsufficientBalanceException {
      if(amount <= balance) {
         balance -= amount;
      }else {
         double needs = amount - balance;
         throw new InsufficientBalanceException(needs);
      }
   }
   
   public double getBalance() {
      return balance;
   }
   
   public int getNumber() {
      return accNo;
   }
}