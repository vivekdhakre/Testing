package cloneEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vivek on 2/4/17.
 */
public class CustomerID {

    private long crmID;
    private int nameSpace;

    public CustomerID(long crmID, int nameSpace) {
        super();
        this.crmID = crmID;
        this.nameSpace = nameSpace;
    }

    public boolean equals(Object obj) {
        //null instanceof Object will always return false
        if (!(obj instanceof CustomerID))
            return false;
        if (obj == this)
            return true;

//        System.out.println(obj.hashCode());
        return  this.crmID == ((CustomerID) obj).crmID &&
                this.nameSpace == ((CustomerID) obj).nameSpace;
    }
    public int hashCode() {
        int result = 0;
        result = (int)(crmID/12) + nameSpace;
        return result;
    }

    public static void main(String[] args) {
        Map<CustomerID,String> m = new HashMap<>();

        CustomerID c1 = new CustomerID(2345891234L,0);
        System.out.println(c1.hashCode());
        CustomerID c2 = new CustomerID(2345891234L,0);
        System.out.println(c2.hashCode());
        m.put(c1,"Jeff Smith");
        System.out.println(m.get(c2));

        CustomerID cid = new CustomerID(2345891234L,0);
//        m.put(cid,"Jeff Smith");
//        System.out.println(m.get(cid));
        List<CustomerID> list = new ArrayList<>();
        list.add(null);
        list.add(cid);

        System.out.println(list.contains(new CustomerID(2345891234L,0)));

    }
}
