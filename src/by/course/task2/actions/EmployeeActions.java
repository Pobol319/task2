package by.course.task2.actions;

import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;

import java.util.ArrayList;
import java.util.List;

import by.course.task2.factory.EmployeeFactory;
import org.apache.log4j.Logger;

public class EmployeeActions {
    private static final Logger log = Logger.getLogger(EmployeeActions.class);

    public static double sumOfNormalHours(List<Employee> listOfEmployees) {
        double sumOfNormalHours = 0;
        try {
            for (Employee employee : listOfEmployees) {
                sumOfNormalHours += ((InformationTechnologySpecialist) employee).getNormalHours();
            }
        } catch (NullPointerException e) {
            log.error("Error in sumOfNormalHours");
        }
        return sumOfNormalHours;
    }

    public static List<Employee> getEmployeesWithSalaryRange(List<Employee> listOfEmployees, double minSalary, double maxSalary) {
        List<Employee> employeesSalaryRange = new ArrayList<>();
        try {
            for (Employee employee : listOfEmployees) {
                if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                    employeesSalaryRange.add(employee);
                }
            }
        } catch (NullPointerException e) {
            log.error("Error in salaryRange");
        }
        return employeesSalaryRange;
    }

    public static void printEmployees(List<Employee> listOfEmployees) {
        try {
            for (Employee employee : listOfEmployees) {
                System.out.println(employee.toString());
            }
        } catch (NullPointerException e) {
            log.error("Error in printEmployees");
        } finally {
            System.out.println();
        }
    }

    public static List<Employee> getListOfEmployee(List<String> listOfEmployeeTxt) {
        List<Employee> listOfEmployee = new ArrayList<>();
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee;
        for (String employeeString : listOfEmployeeTxt) {
            employee = employeeFactory.createEmployee(employeeString);
            if (employee != null) {
                listOfEmployee.add(employee);
            }
        }
        return listOfEmployee;
    }

}
