package by.course.task2.factory;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class EmployeeFactoryTest {
    private String employee;
    private String surname;

    public EmployeeFactoryTest(String employee, String surname) {
        this.employee = employee;
        this.surname = surname;
    }

    @Test
    public void getListOfEmployeeTest() {
        List<String> employeesString = new ArrayList<>();
        employeesString.add(employee);

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Assert.assertEquals(surname, employeeFactory.getListOfEmployee(employeesString).get(0).getSurname());
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"Janitor,Pupkin,Ivan,1000, , ,Full_time, , , ,", "Pupkin"},
                                         {"Developer,Rebrov,Denis,1500.01,Middle,26, , ,Java, ,", "Rebrov"} };
        return Arrays.asList(data);
    }

}
