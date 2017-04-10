package comparablevscomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by vivek on 2/4/17.
 */
public class EmployeeComparable  {

    private int id;
    private String name;
    private int age;
    private long salary;


    public EmployeeComparable(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public static Comparator<EmployeeComparable> SalaryComparator = new Comparator<EmployeeComparable>() {

        @Override
        public int compare(EmployeeComparable e1, EmployeeComparable e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    public static Comparator<EmployeeComparable> AgeComparator = new Comparator<EmployeeComparable>() {

        @Override
        public int compare(EmployeeComparable e1, EmployeeComparable e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    public static Comparator<EmployeeComparable> NameComparator = new Comparator<EmployeeComparable>() {

        @Override
        public int compare(EmployeeComparable e1, EmployeeComparable e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static void main(String[] args) {
        EmployeeComparable[] empArr = new EmployeeComparable[4];
        empArr[0] = new EmployeeComparable(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeComparable(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeComparable(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeComparable(1, "Pankaj", 32, 50000);

//        Collections.sort(empArr,EmployeeComparable.AgeComparator);

        //sort employees array using Comparator by Salary
//        Arrays.sort(empArr, EmployeeComparable.SalaryComparator);
//        System.out.println("Employees list sorted by Salary:\n"+Arrays.toString(empArr));

//sort employees array using Comparator by Age
//        Arrays.sort(empArr, EmployeeComparable.AgeComparator);
//        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));

//sort employees array using Comparator by Name
//        Arrays.sort(empArr, EmployeeComparable.NameComparator);
//        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
    }
}
