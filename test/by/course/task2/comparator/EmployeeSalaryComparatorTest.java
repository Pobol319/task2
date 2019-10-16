package by.course.task2.comparator;

import by.course.task2.entity.Developer;
import by.course.task2.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmployeeSalaryComparatorTest {
    private double salary1;
    private double salary2;
    private int expectedResult;

    public EmployeeSalaryComparatorTest(double normalHours1, double normalHours2, int expectedResult) {
        this.salary1 = normalHours1;
        this.salary2 = normalHours2;
        this.expectedResult = expectedResult;
    }

    @Test
    public void compareTest() {
        Employee employee1 = new Developer();
        Employee employee2 = new Developer();
        employee1.setSalary(salary1);
        employee2.setSalary(salary2);

        EmployeeSalaryComparator comparator = new EmployeeSalaryComparator();
        Assert.assertEquals(expectedResult, comparator.compare(employee1, employee2));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1500, 2000, -1}, {2000, 1500, 1}, {1500, 1500, 0}};
        return Arrays.asList(data);
    }

}
