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

        boolean isValidPosition = isValidRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getEmployeePosition());
        boolean isValidSurname = isValidRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getEmployeeSurname());
        boolean isValidName = isValidRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getEmployeeName());
        boolean isValidSalary = isValidRequiredField(DOUBLE_NUMBER_FIELD_EXPRESSION, employeeInfoParser.getEmployeeSalary());
        boolean isValidRank = isValidNotRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getITSpecialistRank());
        boolean isValidNormalHours = isValidNotRequiredField(DOUBLE_NUMBER_FIELD_EXPRESSION, employeeInfoParser.getITSpecialistNormalHours());
        boolean isValidSchedule = isValidNotRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getJanitorSchedule());
        boolean isValidLevelOfEnglish = isValidNotRequiredField(LEVEL_OF_ENGLISH_FIELD_EXPRESSION, employeeInfoParser.getBALevelOfEnglish());
        boolean isValidLanguageOfDevelopment = isValidNotRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getDevLanguageOfDevelopment());
        boolean isValidKnowledgeOfAutomation = isValidNotRequiredField(WORD_FIELD_EXPRESSION, employeeInfoParser.getTesterKnowledgeOfAutomation());

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
