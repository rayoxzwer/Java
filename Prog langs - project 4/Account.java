public class Account {
  private int acc_num, balance;

  Account(int accountNumber) {
    this.balance = 0;
    this.acc_num = acc_num;
  }

  public int setBalance(int amount) {
    if (balance + amount >= 0) {
      balance = balance + amount;
      return balance;
    }
    return -1;
  }
  public int getBalance(){
    return balance;
  }
  public int getAccountNumber(){
    return acc_num;
  }
}