package comparablevscomparator;

import java.util.*;

/**
 * Created by vivek on 2/4/17.
 */
public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int age;
    private long salary;


    public Employee(int id, String name, int age, long salary) {
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

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
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

    public static void main(String[] args) {
        Employee[] empArr = new Employee[4];

        List<Employee> l1 = new ArrayList<>();

        l1.add(new Employee(10, "Mikey", 25, 10000));
        l1.add(new Employee(20, "Arun", 29, 20000));
        l1.add(new Employee(20, "Arun", 49, 20000));
        l1.add(new Employee(5, "Lisa", 35, 5000));
        l1.add(new Employee(1, "Pankaj", 32, 50000));

        //sorting employees array using Comparable interface implementation
//        Arrays.sort(empArr);
//        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        l1.forEach(l -> System.out.println(l));
        List<Comparator<Employee>> list = new ArrayList<>();
        list.add(new NameComparator());
        list.add(new AgeComparator());
        list.add(new SalaryComparator());

        Collections.sort(l1,new EmployeeChainedComparator(list));

        l1.forEach(l -> System.out.println(l));




    }
}
