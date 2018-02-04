package a2_factory.com.phone;

/**
 * Created by kagarwal on 2/3/18.
 */
public class OperatingSystemFactory {
    public OS getInstance(String type) {
        if ("Open".equals(type)) {
            return new Android();
        } else if ("Closed".equals(type)) {
            return new iOS();
        } else {
            return new Windows();
        }
    }
}
