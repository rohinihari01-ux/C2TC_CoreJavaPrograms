package com.rohini.assignment.utilities;
import com.rohini.assignment.employees.Employee;

public class EmployeeUtilities {
	public static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
    }

}
