package by.course.task2.factory;

import by.course.task2.entity.*;
import by.course.task2.enums.ITSpecialistRankEnum;
import by.course.task2.parser.EmployeeInfoParser;

public class EmployeeFactory {

    public Employee createEmployee(String temp) {
        EmployeeInfoParser employeeInfoParser = new EmployeeInfoParser(temp);
        Employee employee = null;
        switch (employeeInfoParser.getEmployeePosition()) {
            case "BusinessAnalyst": {
                employee = new BusinessAnalyst();
                employee.setName(employeeInfoParser.getEmployeeName());
                return employee;
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

    private void setFieldsOfEmployee(Employee employee, EmployeeInfoParser employeeInfoParser) {
        employee.setName(employeeInfoParser.getEmployeeName());
        employee.setSurname(employeeInfoParser.getEmployeeSurname());
        employee.setSalary(Double.parseDouble(employeeInfoParser.getEmployeeSalary()));
    }

    private void setFieldsOfITSpecialist(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((InformationTechnologySpecialist) employee).setRank(ITSpecialistRankEnum.valueOf(employeeInfoParser.getITSpecialistRank()));
        ((InformationTechnologySpecialist) employee).setNormalHours(Double.parseDouble(employeeInfoParser.getITSpecialistNormalHours()));
    }
}
