package by.course.task2.factory;

import by.course.task2.entity.*;
import by.course.task2.parser.StringParser;

public class EmployeeFactory {

    public static Employees createEmployee(String temp) {
        StringParser stringParser = new StringParser(temp);
        switch (stringParser.getPositionField()) {
            case "BusinessAnalyst": {
                return new BusinessAnalyst();
                            }
            case "Developer": {
                return new Developer();
            }
            case "Tester": {
                return new Tester();
            }
            case "Janitor": {
                return new Janitor();
            }
        }
        return null;
    }
}
