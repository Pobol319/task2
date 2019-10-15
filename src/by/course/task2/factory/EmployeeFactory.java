package by.course.task2.factory;

import by.course.task2.entity.*;
import by.course.task2.parser.EmployeeInfoParser;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFactory {
    private static final Logger log = Logger.getLogger(EmployeeFactory.class);

    public List<Employee> getListOfEmployee(List<String> listOfEmployeeTxt) {
        List<Employee> listOfEmployee = new ArrayList<>();
        Employee employee;
        for (String employeeString : listOfEmployeeTxt) {
            employee = createEmployee(employeeString);
            listOfEmployee.add(employee);
        }
        return listOfEmployee;
    }

    private Employee createEmployee(String temp) {
        EmployeeInfoParser employeeInfoParser = new EmployeeInfoParser(temp);
        Employee employee;
        switch (employeeInfoParser.getEmployeePosition()) {
            case "BusinessAnalyst": {
                employee = new BusinessAnalyst();
                setEmployeeFields(employee, employeeInfoParser);
                setITSpecialistFields(employee, employeeInfoParser);
                setBAFields(employee, employeeInfoParser);
                return employee;
            }
            case "Developer": {
                employee = new Developer();
                setEmployeeFields(employee, employeeInfoParser);
                setITSpecialistFields(employee, employeeInfoParser);
                setDevFields(employee, employeeInfoParser);
                return employee;
            }
            case "Tester": {
                employee = new Tester();
                setEmployeeFields(employee, employeeInfoParser);
                setITSpecialistFields(employee, employeeInfoParser);
                setTesterFields(employee, employeeInfoParser);
                return employee;
            }
            case "Janitor": {
                employee = new Janitor();
                setEmployeeFields(employee, employeeInfoParser);
                setJanitorFields(employee, employeeInfoParser);
                return employee;
            }
        }
        log.info("Null employee was created");
        return null;
    }

    private void setEmployeeFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        employee.setName(employeeInfoParser.getEmployeeName());
        employee.setSurname(employeeInfoParser.getEmployeeSurname());
        employee.setSalary(Double.parseDouble(employeeInfoParser.getEmployeeSalary()));
        log.info("Set Employee fields");
    }

    private void setITSpecialistFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((InformationTechnologySpecialist) employee).setRank(ITSpecialistRankEnum.getITSpecialistRankEnum(employeeInfoParser.getITSpecialistRank()));
        ((InformationTechnologySpecialist) employee).setNormalHours(Double.parseDouble(employeeInfoParser.getITSpecialistNormalHours()));
        log.info("Set IT specialist fields");
    }

    private void setJanitorFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((Janitor) employee).setSchedule(JanitorScheduleEnum.getJanitorScheduleEnum(employeeInfoParser.getJanitorSchedule()));
        log.info("Set Janitor fields");
    }

    private void setBAFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((BusinessAnalyst) employee).setLevelOfEnglish(BAEnglishLevelEnum.valueOf(employeeInfoParser.getBALevelOfEnglish()));
        log.info("Set Ba fields");
    }

    private void setDevFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((Developer) employee).setLanguageOfDevelopment(DevLanguageEnum.getDevLanguageEnum(employeeInfoParser.getDevLanguageOfDevelopment()));
        log.info("Set Developer fields");
    }

    private void setTesterFields(Employee employee, EmployeeInfoParser employeeInfoParser) {
        ((Tester) employee).setKnowledgeOfAutomation(TesterAutomationKnowledgeEnum.getTesterAutomationKnowledgeEnum(employeeInfoParser.getTesterKnowledgeOfAutomation()));
        log.info("Set Tester fields");
    }
}
