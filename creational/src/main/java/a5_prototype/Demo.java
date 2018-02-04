package a5_prototype;

/**
 * Created by kagarwal on 2/4/18.
 * https://www.youtube.com/watch?v=nZ76x13Nm8Q
 */
public class Demo{
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopname("Novelty");
        bs.loadData();


        //Shallow Cloning
//        BookShop bs1 = (BookShop) bs.clone();
//        bs1.setShopname("A1");
//        //bs1.loadData();
//        System.out.println(bs1);

        //Deep Cloning
        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopname("A1");
        System.out.println(bs);
        System.out.println(bs1);

    }
}
