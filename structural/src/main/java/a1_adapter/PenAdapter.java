package a1_adapter;

/**
 * Created by kagarwal on 2/4/18.
 */
public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    public void write(String str) {
        pp.mark(str);
    }
}
