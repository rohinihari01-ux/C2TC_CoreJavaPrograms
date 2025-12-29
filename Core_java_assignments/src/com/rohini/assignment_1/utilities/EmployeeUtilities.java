package com.rohini.assignment_1.utilities;

import com.rohini.assignment_1.employees.Employee;

public class EmployeeUtilities {
	public static void displayEmployee(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
    }

}