package by.course.task2.validator;

import by.course.task2.parser.EmployeeInfoParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constants.RegularExpressions.*;

public class Validator {

    public static boolean isValidEmployee(String temp) {

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

   /* public boolean isValidEmployee(String temp) {
        if (isValidPosition(temp)) {
            String position = fieldsReader.positionReader(temp);
            if (position.equals("BusinessAnalyst")) {

            }

        }
        isValidPosition(temp);
        isValidRank(temp);
        return false;
    }*/

    /*private boolean isValidFieldsOfEmployee(String temp) {
        return true;
    }

    private boolean isValidName(String temp) {
        Pattern pattern = Pattern.compile(NAME_EXPRESSION);
        Matcher matcher = pattern.matcher(temp);
        return true;
    }


    private boolean isValidPosition(String temp) {
        String position = fieldsReader.positionReader(temp);
        for (EmployeePositionEnum positionType : EmployeePositionEnum.values()) {
            if (positionType.position.equals(position)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidRank(String temp) {
        Pattern pattern = Pattern.compile(RANK_EXPRESSION);
        Matcher matcher = pattern.matcher(temp);
        matcher.find();
        System.out.println(matcher.group(1));

        return true;
    }*/


}
