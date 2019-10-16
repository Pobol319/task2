package by.course.task2.actions;

import by.course.task2.entity.BusinessAnalyst;
import by.course.task2.entity.Developer;
import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActionsTest {
    private List<Employee> employees = new ArrayList<>();
    private InformationTechnologySpecialist employee1 = new BusinessAnalyst();
    private InformationTechnologySpecialist employee2 = new Developer();

    @Before
    public void setUp() {
        employee1.setNormalHours(20);
        employee1.setSalary(1000);
        employees.add(employee1);

        employee2.setNormalHours(46.23);
        employee2.setSalary(2500);
        employees.add(employee2);
    }

    @Test
    public void sumOfNormalHoursTest() {
        Assert.assertEquals(66.23, EmployeeActions.sumOfNormalHours(employees), 0.1);
    }

    @Test
    public void salaryRangeTest() {
        List<Employee> employeesAfterSalaryRange = EmployeeActions.getEmployeesFromSalaryRange(employees, 2000, 3000);
        employees.remove(0);
        Assert.assertEquals(employeesAfterSalaryRange, employees);
    }

}
