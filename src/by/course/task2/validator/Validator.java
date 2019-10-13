package by.course.task2.validator;

import by.course.task2.parser.EmployeeInfoParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constants.RegularExpressions.*;

public class Validator {

    public static boolean isValidEmployee(String temp) {

        if (temp.isEmpty()) {
            return false;
        }

        EmployeeInfoParser employeeInfoParser = new EmployeeInfoParser(temp);

        boolean isValidPosition = isValidRequiredField(POSITION_FIELD_EXPRESSION, employeeInfoParser.getEmployeePosition());
        boolean isValidSurname = isValidRequiredField(SURNAME_FIELD_EXPRESSION, employeeInfoParser.getEmployeeSurname());
        boolean isValidName = isValidRequiredField(NAME_FIELD_EXPRESSION, employeeInfoParser.getEmployeeName());
        boolean isValidSalary = isValidRequiredField(SALARY_FIELD_EXPRESSION, employeeInfoParser.getEmployeeSalary());
        boolean isValidRank = isValidNotRequiredField(RANK_FIELD_EXPRESSION, employeeInfoParser.getITSpecialistRank());
        boolean isValidNormalHours = isValidNotRequiredField(NORMAL_HOURS_FIELD_EXPRESSION, employeeInfoParser.getITSpecialistNormalHours());
        boolean isValidSchedule = isValidNotRequiredField(SCHEDULE_FIELD_EXPRESSION, employeeInfoParser.getJanitorSchedule());
        boolean isValidLevelOfEnglish = isValidNotRequiredField(LEVEL_OF_ENGLISH_FIELD_EXPRESSION, employeeInfoParser.getBALevelOfEnglish());
        boolean isValidLanguageOfDevelopment = isValidNotRequiredField(LANGUAGE_OF_DEVELOPMENT_FIELD_EXPRESSION, employeeInfoParser.getDevLanguageOfDevelopment());
        boolean isValidKnowledgeOfAutomation = isValidNotRequiredField(KNOWLEDGE_OF_AUTOMATION_FIELD_EXPRESSION, employeeInfoParser.getTesterKnowledgeOfAutomation());

        return isValidPosition && isValidSurname && isValidName && isValidSalary && isValidRank
                && isValidNormalHours && isValidSchedule && isValidLevelOfEnglish && isValidLanguageOfDevelopment
                && isValidKnowledgeOfAutomation;
    }

    private static boolean isValidRequiredField(String regularExpression, String field) {
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(field);
        return matcher.find();
    }

    private static boolean isValidNotRequiredField(String regularExpression, String field) {
        if (field.equals(" ")) {
            return true;
        } else {
            Pattern pattern = Pattern.compile(regularExpression);
            Matcher matcher = pattern.matcher(field);
            return matcher.find();
        }
    }
}
