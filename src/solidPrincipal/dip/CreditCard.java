package solidPrincipal.dip;

public class CreditCard implements BankCard {
    @Override
    public void doTransaction(double amount) {
        System.out.println(amount + " debited from your credit card.");
    }
}
