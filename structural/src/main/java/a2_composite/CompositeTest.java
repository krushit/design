package a2_composite;

/**
 * Created by kagarwal on 2/4/18.
 * https://www.youtube.com/watch?v=Q1jZ4TI6MF4
 */
public class CompositeTest {
    public static void main(String[] args) {
        Component hardDrive = new Leaf(4000, "HDD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(9000, "CPU");

        Composite peripheral = new Composite("Peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        //peripheral.showPrice();
        computer.showPrice();

    }
}
