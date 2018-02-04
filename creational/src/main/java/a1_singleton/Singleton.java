package a1_singleton;

/**
 * Singleton - when you want everyone to create only a same single instance of the class
 */
public class Singleton {
    //Abc ob1 = new Abc(); //two different objects
    //Abc ob2 = new Abc(); //two different objects

    Abc obj1 = Abc.getInstance();
    Abc obj2 = Abc.getInstance();

    //Abc obj3 = new Abc(); //Not allow by design

}

class Abc {

    //Create a static object in the class itself
    static Abc obj = new Abc();

    // Do not allow user to create a new object
    private Abc() {
    }

    // Now create a method which users can use to get the reference to the same single static object
    public static Abc getInstance() {
        return obj;
    }
}