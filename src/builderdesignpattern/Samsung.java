package builderdesignpattern;

/**
 * Created by vivek on 15/2/17.
 */
public class Samsung extends Company {

    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack() {
        return "Samsung CD";
    }
}
