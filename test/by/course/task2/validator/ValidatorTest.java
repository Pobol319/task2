package by.course.task2.validator;


import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void isValidEmployeePositiveTest() {
        String temp = "BusinessAnalyst,Pobol,Pavel,450,Junior,10, ,B1, , ,";
        Assert.assertTrue(Validator.isValidEmployee(temp));
    }

    @Test
    public void isValidEmployeeNegativeTest() {
        String temp = "BusinessAnalyst,Pobol,Pavel,pap,Junior,10, ,A1, , ,";
        Assert.assertFalse(Validator.isValidEmployee(temp));
    }
}
