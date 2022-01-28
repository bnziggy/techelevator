package com.techelevator;

public class Employee {
    private int employeeID;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    public Employee(int employeeID, String firstName, String lastName,
                    double annualSalary) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public void raiseSalary(double perecent) {
        annualSalary = annualSalary + (annualSalary * (perecent / 100));
    }

    public int getEmployeeId() {
        return employeeID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

}
