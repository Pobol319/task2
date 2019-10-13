package by.course.task2.util;

import by.course.task2.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> salaryRange(List<Employee> allEmployees, double minSalary, double maxSalary) {
        List<Employee> employeesSalaryRange = new ArrayList<>();
        for (Employee employee : allEmployees) {
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                employeesSalaryRange.add(employee);
            }
        }
        return employeesSalaryRange;
    }

    public static void printEmployees(List<Employee> listOfEmployee) {
        for (Employee employee : listOfEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println();
    }
}
