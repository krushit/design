package a1_adapter;

/**
 * Created by kagarwal on 2/4/18.
 */
public class School {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p); //Pen Object
        aw.writeAssignment("I am bit tired to write the assignment");
    }
}
