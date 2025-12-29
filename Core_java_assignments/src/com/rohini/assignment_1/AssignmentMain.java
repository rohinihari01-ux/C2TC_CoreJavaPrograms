package com.rohini.assignment_1;

import com.rohini.assignment_1.employees.Developer;
import com.rohini.assignment_1.employees.Manager;
import com.rohini.assignment_1.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Rohini");
        manager.setEmployeeId(101);
        manager.setProjectCount(5);

        Developer developer = new Developer();
        developer.setName("Anu");
        developer.setEmployeeId(102);
        developer.setLanguageKnown("Java");

        EmployeeUtilities.displayEmployee(manager);
        EmployeeUtilities.displayEmployee(developer);
    }
}