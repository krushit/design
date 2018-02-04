package a4_builder;

/**
 * Created by kagarwal on 2/4/18.
 */
public class Shop {
    public static void main(String[] args) {
//        Phone p = new Phone("Android", 2, "Qualcomm", 5.5, 3100);

        //Only set the parameters that you want to set and rest of them take default values
      Phone p = new PhoneBuilder()
              .setOS("Android")
              .setRam(2)
              .setBattery(3000)
              .getPhone();
        System.out.println(p);

    }
}
