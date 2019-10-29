package by.course.task2.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class EmployeeFactoryTest {
    private String employee;
    private String surname;

    public EmployeeFactoryTest(String employee, String surname) {
        this.employee = employee;
        this.surname = surname;
    }

    @Test
    public void createEmployeeTest() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Assert.assertEquals(surname, EmployeeFactory.createEmployee(employee).getSurname());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"Janitor,Pupkin,Ivan,1000, , ,Full_time, , , ,", "Pupkin"},
                {"Developer,Rebrov,Denis,1500.01,Middle,26, , ,Java, ,", "Rebrov"}};
        return Arrays.asList(data);
    }

}
