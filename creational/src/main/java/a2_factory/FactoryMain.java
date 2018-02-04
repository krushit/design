package a2_factory;

import a2_factory.com.phone.Android;
import a2_factory.com.phone.OS;
import a2_factory.com.phone.OperatingSystemFactory;

/**
 * Created by kagarwal on 2/3/18.
 * https://www.youtube.com/watch?v=pt1IbV1aSZ4
 */
public class FactoryMain {
    public static void main(String[] args) {

        // this needs to be avoided as it requires the client to know the underlying class
        // if we use the factory method, we can switch the underlying class without having the
        // client to change anything
//        OS obj1 = new Android();
//        obj1.spec();


        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
        obj = osf.getInstance("Closed");
        obj.spec();
        obj = osf.getInstance("Other");
        obj.spec();
    }
}
