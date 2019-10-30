package by.course.task2.validator;

import by.course.task2.parser.EmployeeInfoParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constants.RegularExpressions.*;

public class Validator {
    public static boolean isValidEmployee(String temp) {

        if(temp == null){
            return false;
        }

        if (temp.isEmpty()) {
            return false;
        }

        EmployeeInfoParser employeeInfoParser = new EmployeeInfoParser(temp);

        boolean isValidPosition = isValidRequiredField(employeeInfoParser.getEmployeePosition());
        boolean isValidSurname = isValidRequiredField(employeeInfoParser.getEmployeeSurname());
        boolean isValidName = isValidRequiredField(employeeInfoParser.getEmployeeName());
        boolean isValidSalary = isValidRequiredField(employeeInfoParser.getEmployeeSalary());
        boolean isValidRank = isValidNotRequiredField(employeeInfoParser.getITSpecialistRank());
        boolean isValidNormalHours = isValidNotRequiredField(employeeInfoParser.getITSpecialistNormalHours());
        boolean isValidSchedule = isValidNotRequiredField(employeeInfoParser.getJanitorSchedule());
        boolean isValidLevelOfEnglish = isValidNotRequiredField(employeeInfoParser.getBALevelOfEnglish());
        boolean isValidLanguageOfDevelopment = isValidNotRequiredField(employeeInfoParser.getDevLanguageOfDevelopment());
        boolean isValidKnowledgeOfAutomation = isValidNotRequiredField(employeeInfoParser.getTesterKnowledgeOfAutomation());

        return isValidPosition && isValidSurname && isValidName && isValidSalary && isValidRank
                && isValidNormalHours && isValidSchedule && isValidLevelOfEnglish && isValidLanguageOfDevelopment
                && isValidKnowledgeOfAutomation;
    }

    private static boolean isValidRequiredField(String field) {
        Pattern pattern = Pattern.compile(EXPRESSION);
        Matcher matcher = pattern.matcher(field);
        return matcher.find();
    }

    private static boolean isValidNotRequiredField(String field) {
        if (field.equals(" ")) {
            return true;
        } else {
            Pattern pattern = Pattern.compile(EXPRESSION);
            Matcher matcher = pattern.matcher(field);
            return matcher.find();
        }
    }
}
