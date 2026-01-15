package solidPrincipal.dip;

public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doSomePurchase(double amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doSomePurchase(5000);
    }
}
