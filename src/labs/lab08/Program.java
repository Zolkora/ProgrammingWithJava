package labs.lab08;

public class Program {

    public static void main(String[] args) {
        
        int k =100;
        incInt(k);
        System.out.println(k);

        Account account = new Account(1, "Stephen", 100);
        account.deposit(50);
        account.withdraw(30);
        account.addInterest();
        System.out.println(account.getDetails());
    
        Account myAccount = new Account(2, "John", 100);
        myAccount.addInterest();
        System.out.println(myAccount.getDetails());
    
        Account partnerAccount = myAccount;
        partnerAccount.addInterest();
        System.out.println(partnerAccount.getDetails());
    
        processAccount(myAccount);
        System.out.println(myAccount.getDetails());
    }

    public static void processAccount(Account acc){
        acc.addInterest();
    }

    private static void incInt(int x){
        x++;
    }


}
