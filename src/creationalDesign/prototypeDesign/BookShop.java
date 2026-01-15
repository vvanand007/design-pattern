package creationalDesign.prototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {
        for(int i=0; i<10; i++) {
            books.add(new Book(i , "Book "+i));
        }
    }


    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() {
//        try {
            BookShop clone = new BookShop();
            for(Book b : getBooks()) {
                clone.getBooks().add(b);
            }
            return clone;
//        }
//        catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
    }
}
