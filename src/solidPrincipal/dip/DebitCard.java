package solidPrincipal.dip;

public class DebitCard implements BankCard {
    @Override
    public void doTransaction(double amount) {
        System.out.println(amount + " debited from your debit card.");
    }
}
