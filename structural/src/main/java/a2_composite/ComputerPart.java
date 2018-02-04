package a2_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kagarwal on 2/4/18.
 * https://www.youtube.com/watch?v=Q1jZ4TI6MF4
 */

interface Component {
    void showPrice();
}

class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void showPrice() {
        System.out.println("Name: " + name + ", Price: " + price);
    }
}

class Composite implements Component{

    String name;
    List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component comp) {
        components.add(comp);
    }

    public void showPrice() {
        System.out.println("Component Name: " + name);
        for (Component c: components) {
            c.showPrice();
        }
        System.out.println();
    }
}