package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private int payDay;

    private Address address;
    public List<Employee> employess = new ArrayList<>();


    public Department() {
    }

    public Department(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addEmployee(Employee employee){
        employess.add(employee);
    }

    public void removeEmployee(Employee employee){
        employess.remove(employee);
    }

    public double payroll(){
       double sum = 0;
        for(Employee list : employess) {
            sum += list.getSalary();
        }
         return sum;
    }



}
