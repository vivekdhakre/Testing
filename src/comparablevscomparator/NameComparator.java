package comparablevscomparator;

import java.util.Comparator;

/**
 * Created by vivek on 2/4/17.
 */
public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getName().compareTo(o2.getName()));
    }
}
