package builderdesignpattern;

/**
 * Created by vivek on 15/2/17.
 */
public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cds=new CDType();
        cds.addItem(new Sony());
        return cds;
    }
    public CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}
