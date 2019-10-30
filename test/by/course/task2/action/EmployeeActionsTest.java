package by.course.task2.action;

import by.course.task2.entity.BusinessAnalyst;
import by.course.task2.entity.Developer;
import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActionsTest {

    @Test
    public void sumOfNormalHoursTest() {
        List<Employee> employees = new ArrayList<>();
        InformationTechnologySpecialist employee1 = new BusinessAnalyst();
        InformationTechnologySpecialist employee2 = new Developer();

        employee1.setNormalHours(20);
        employees.add(employee1);

        employee2.setNormalHours(46.23);
        employees.add(employee2);

        Assert.assertEquals(66.23, EmployeeActions.sumOfNormalHours(employees), 0.1);
    }

    @Test
    public void getEmployeesWithSalaryRangeTest() {
        List<Employee> employees = new ArrayList<>();
        InformationTechnologySpecialist employee1 = new BusinessAnalyst();
        InformationTechnologySpecialist employee2 = new Developer();

        employee1.setSalary(1000);
        employees.add(employee1);

        employee2.setSalary(2500);
        employees.add(employee2);

        List<Employee> employeesAfterSalaryRange = EmployeeActions.getEmployeesWithSalaryRange(employees, 2000, 3000);
        employees.remove(0);
        Assert.assertEquals(employeesAfterSalaryRange, employees);
    }

    @Test
    public void getListOfEmployeeTest() {
        List<String> employeesString = new ArrayList<>();
        employeesString.add("Janitor,Pupkin,Ivan,1000, , ,Full_time, , , ,");
        String surname = "Pupkin";

        Assert.assertEquals(surname, EmployeeActions.getListOfEmployee(employeesString).get(0).getSurname());
    }

}
