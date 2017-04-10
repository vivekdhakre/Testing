package abstractfactorypattern;

/**
 * Created by vivek on 1/2/17.
 */
public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
