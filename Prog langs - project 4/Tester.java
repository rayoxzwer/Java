public class Tester {
  public static void main (String[] args) {
        Bank jysan = new Bank();
        ATM qazkom = new ATM();

        jysan.attachATM(qazkom);


        Customer Raim = new Customer(jysan, qazkom);
        Customer Aza = new Customer(jysan, qazkom);

        Raim.openAccount();
        Raim.depositMoney(800);

        System.out.println("Raim has " + Raim.checkBalance());

        Aza.openAccount();
        Aza.depositMoney(50);
        Aza.withdrawMoney(30);
        System.out.println("Aza has " + Aza.checkBalance());
      public static void main(String[] args) {
        Bank bank=new Bank();
        Customer customers[]=new Customer[5];
        for(int i=0;i<5;i++){
            System.out.println("The account number:"+(i+1));
            customers[i]=new Customer(bank);
            customers[i].openAccount();
            customers[i].checkBalance();
            customers[i].depositMoney(42500);
            customers[i].checkBalance();
            customers[i].withdrawMoney(21250);
            customers[i].checkBalance();
        }
        customers[0].withdrawMoney(488484);
        customers[0].checkBalance();
    }
    }
}
