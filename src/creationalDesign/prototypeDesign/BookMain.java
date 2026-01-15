package creationalDesign.prototypeDesign;

public class BookMain {
    public static void main(String[] args) {
        BookShop shop1 = new BookShop();
        shop1.setShopName("Wheeler");
        shop1.loadBooks();

        BookShop shop2 = shop1.clone();
        shop2.setShopName("Wheeler new");
        shop1.getBooks().remove(0);

        System.out.println("shop1 : " + shop1);
        System.out.println("shop2 : " + shop2);
    }
}
