package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
        private int departmentList;

    private void run() {
        // create some departments
        createDepartments();
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Marketing");
        departmentList.add("Sales");
        departmentList.add("Engineering");

        // print each department by name
        printDepartments();
                for(int i = 0; i < departmentList.size(); i++){
            System.out.println(departmentList.get(i));
                  }


        // create employees
        createEmployees();
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
            employee1.setEmployeeId(1);
            employee1.setFirstName("Dean");
            employee1.setLastName("Johnson");
            employee1.setEmail("djohnson@teams.com");
            employee1.setHireDate("08/21/2020");


        Employee employee2 = new Employee("Angie", "Smith", "08/21/2020");
       Employee employee3 = new Employee("Margaret", "Thompson", "08/21/2020");




        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();
        System.out.println(employee1.setGetFullName()+ " (" + employee1.getStartingSalary + ") " );
        System.out.println(employee2.setGetFullName() + " (" + employee2.raiseSalary(10) + ")");
        System.out.println(employee3.setGetFullName() + " (" + employee3.getStartingSalary + ")");


        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
