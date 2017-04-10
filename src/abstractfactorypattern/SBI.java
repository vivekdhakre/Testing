package abstractfactorypattern;

/**
 * Created by vivek on 1/2/17.
 */
public class SBI implements Bank{

    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }

}
