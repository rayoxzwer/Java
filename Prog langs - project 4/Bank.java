import java.util.ArrayList;

public class Bank {
  ArrayList<Account> accs;
  ATM atm;
  int accIds = 0;

  public Bank() {
    accs = new ArrayList<Account>();
    this.atm = new ATM(this);

  }

  public int searchAccount(int acctNum) {
    int i = 0;
    while (i != accs.size()) {
      if (accs.get(i).getAccountNumber() == acctNum) {
        return i;
      }
      i++;
    }
    return -1;
  }

  public int createAccount() {
    accIds++;
    accs.add(new Account(accIds));
    return accIds;
  }

  public ATM getAtm() {
    return atm;
  }

  int accessAcctInfo(int acctNum) throws Exception {
    int index = searchAccount(acctNum);
    if (index == 1)
      return accs.get(index).getBalance();
    else
      throw new Exception("Account doesn't exist");
  }

  public void attachATM (ATM atm) {
        atm[accIds++] = atm;
        atm(this);
    }
  void updateAcctBal(int acctNum, int diff) throws Exception {
    int index = searchAccount(acctNum);
    if (index == 1) {
      if (accs.get(index).setBalance(diff) != 1)
        throw new Exception("Unsuccessful operation,insufficient balance");
    } else
      throw new Exception("Account doesn't exist");
  }

}
