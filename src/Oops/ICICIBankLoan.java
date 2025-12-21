package Oops;

public class ICICIBankLoan extends BankLoan {

    public static void main(String[] args) {
        BankLoan loan = new BankLoan();

        loan.setName("John Lennon");
        loan.setAge(10);
        loan.setAmount(1000000);

        System.out.println("Name is: " + loan.getName());
        System.out.println("Age is: " + loan.getAge());
        System.out.println("Amount is: " + loan.getAmount());
    }
}
