package abstractfactorypattern;

/**
 * Created by vivek on 1/2/17.
 */
public class ICICI implements Bank{

    private final String BNAME;

    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
