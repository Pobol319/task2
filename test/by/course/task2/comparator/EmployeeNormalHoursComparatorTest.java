package by.course.task2.comparator;

import by.course.task2.entity.Developer;
import by.course.task2.entity.InformationTechnologySpecialist;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmployeeNormalHoursComparatorTest {
    private double normalHours1;
    private double normalHours2;
    private int expectedResult;

    public EmployeeNormalHoursComparatorTest(double normalHours1, double normalHours2, int expectedResult) {
        this.normalHours1 = normalHours1;
        this.normalHours2 = normalHours2;
        this.expectedResult = expectedResult;
    }

    @Test
    public void compareTest() {
        InformationTechnologySpecialist employee1 = new Developer();
        InformationTechnologySpecialist employee2 = new Developer();
        employee1.setNormalHours(normalHours1);
        employee2.setNormalHours(normalHours2);

        EmployeeNormalHoursComparator comparator = new EmployeeNormalHoursComparator();
        Assert.assertEquals(expectedResult, comparator.compare(employee1, employee2));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{40, 60, -1}, {60, 40, 1}, {40, 40, 0}};
        return Arrays.asList(data);
    }

}
