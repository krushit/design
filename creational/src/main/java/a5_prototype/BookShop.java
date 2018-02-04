package a5_prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kagarwal on 2/4/18.
 */
public class BookShop implements Cloneable {
    private String shopname;
    List<Book> books = new ArrayList<Book>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        //FIXME: replace with database code, for the demo purposes we will create dummy data
        for (int i=0; i<=10; i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book " + i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }

    //Shallow Cloning
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //Deep Clining
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b: getBooks()) {
            shop.getBooks().add(b);
        }
        return shop;
    }

}
