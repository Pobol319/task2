package by.course.task2.action;

import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;

import java.util.ArrayList;
import java.util.List;

import by.course.task2.factory.EmployeeFactory;
import org.apache.log4j.Logger;

public class EmployeeActions {

    public static double sumOfNormalHours(List<Employee> listOfEmployees) {
        double sumOfNormalHours = 0;
        for (Employee employee : listOfEmployees) {
            sumOfNormalHours += ((InformationTechnologySpecialist) employee).getNormalHours();
        }
        return sumOfNormalHours;
    }

    public static List<Employee> getEmployeesWithSalaryRange(List<Employee> listOfEmployees, double minSalary, double maxSalary) {
        List<Employee> employeesSalaryRange = new ArrayList<>();
        for (Employee employee : listOfEmployees) {
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                employeesSalaryRange.add(employee);
            }
        }
        return employeesSalaryRange;
    }

    public static void printEmployees(List<Employee> listOfEmployees) {
        for (Employee employee : listOfEmployees) {
            System.out.println(employee.toString());
        }
        System.out.println();
    }

    public static List<Employee> getListOfEmployee(List<String> listOfEmployeeTxt) {
        List<Employee> listOfEmployee = new ArrayList<>();
        Employee employee;
        for (String employeeString : listOfEmployeeTxt) {
            employee = EmployeeFactory.createEmployee(employeeString);
            if (employee != null) {
                listOfEmployee.add(employee);
            }
        }
        return listOfEmployee;
    }

}
