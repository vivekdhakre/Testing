package comparablevscomparator;

import java.util.Comparator;
import java.util.List;

/**
 * Created by vivek on 2/4/17.
 */
public class EmployeeChainedComparator implements Comparator<Employee> {

    public List<Comparator<Employee>> list;

    public EmployeeChainedComparator(List<Comparator<Employee>> list) {
        this.list = list;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        for (Comparator<Employee> comparator : list) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
            return result;
            }
        }
        return 0;
    }
}
