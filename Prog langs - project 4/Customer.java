
public class Customer {
  Bank bank;
  int accNumber = 0;

  Customer(Bank bank) {
    this.bank = bank;
  }

  void openAccount() {
    this.accountNumber = bank.createAccount();
  }

  void depositMoney(int amount) {
    bank.getAtm().loginToAccount(accountNumber);
    bank.getAtm().deposit(amount);
    accNumber = 0;
    System.out.println("The program stopped running...");
  }

  void withdrawMoney(int amount) {
    bank.getAtm().loginToAccount(accountNumber);
    bank.getAtm().withdraw(amount);
    accNumber = 0;
    System.out.println("The program stopped running...");
  }

  void checkBalance() {
    bank.getAtm().loginToAccount(accountNumber);
    System.out.println("The current balance is:" + bank.getAtm().getBalance());
    accNumber = 0;
    System.out.println("The program stopped running...");
  }

}
