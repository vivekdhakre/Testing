package abstractfactorypattern;

/**
 * Created by vivek on 1/2/17.
 */
public class HDFC implements Bank {

    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
