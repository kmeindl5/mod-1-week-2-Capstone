package com.techelevator;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary = 60000.00;
    private Department department;
    private String hireDate;

    public static final Double STARTING_SALARY = 60000.00;

    public Employee (){}

    public Employee (String employeeInfo){

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;

        }
        public Employee(String firstName, String lastName, String hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        }

    public long getEmployeeId() {
        return employeeId;
    }
    public String getFirstName(){
       return  firstName;
}

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public String setGetFullName(){
        return lastName + ", " + firstName;
    }
    public Double raiseSalary(double percent){
        return (STARTING_SALARY*percent)/100 + STARTING_SALARY;
    }

    public Double getStartingSalary = STARTING_SALARY;
}
