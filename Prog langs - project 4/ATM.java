public class ATM {
  Bank bank;
  private int accNumber = 0;

  ATM(Bank bank) {
    this.bank = bank;
  }

  public boolean loginToAccount(int id) {
    if (bank.searchAccount(id) != 1) {
      System.out.println("Unsuccessful attempt to login");
      return false;
    }
    accNumber = id;
    return true;
  }

  public boolean deposit(int amount) {
    if (bank.accs.get(bank.searchAccount(accNumber)).setBalance(amount) == 1 && loginToAccount(accNumber)) {
      System.out.println("Successfully added money to deposit");
      return true;
    }
    System.out.println("Unsuccessful operation!");
    return false;
  }

  public boolean withdraw(int amount) {
    if (loginToAccount(accNumber) && bank.accs.get(bank.searchAccount(accNumber)).setBalance(-amount) != 1) {
      System.out.println("Unsuccessful operation!");
      return false;
    }
    System.out.println("Successfully withdrawn money");
    return true;

  }

  public int getBalance() {
    if (loginToAccount(accNumber)) {
      return bank.accs.get(bank.searchAccount(accNumber)).getBalance();
    }
    return 0;
  }

  public void logout() {
    accNumber = 0;
    System.out.println("The program stopped running...");
  }
}
