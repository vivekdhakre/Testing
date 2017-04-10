package builderdesignpattern;

/**
 * Created by vivek on 15/2/17.
 */
public class Sony extends Company {

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }
}
