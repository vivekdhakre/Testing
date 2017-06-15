package com.journaldev.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahoy on 5/6/17.
 */
public class Employee implements Cloneable {


    private List<String> empList;

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        empList.add("vivek");
        empList.add("Dhakre");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}

class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();
        Employee employee2 = (Employee) employee.clone();


        List<String> empList1 = employee1.getEmpList();
        empList1.add("Pankaj");

        List<String> empList2 = employee2.getEmpList();
        empList2.remove("Dhakre");

        System.out.println(employee.getEmpList());
        System.out.println(empList1);
        System.out.println(empList2);


    }
}
