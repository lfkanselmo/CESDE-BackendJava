package com.cesde.poo.models;

public class Employee extends User{

    private double Salary;
    private String area;

    public Employee() {
    }

    public Employee(String id, String name, String email, String phoneNumber, String password, String address, double salary, String area) {
        super(id, name, email, phoneNumber, password, address);
        Salary = salary;
        this.area = area;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String toString() {
        return "Employee [" +
                "id = " + getId() + '\n' +
                "Name = " + getName() + '\n' +
                "Email = " + getEmail() + '\n' +
                "PhoneNumber = " + getPhoneNumber() + '\n' +
                "Address = " + getAddress() + '\n' +
                "Area = " + getArea() +
                ']';
    }
}
