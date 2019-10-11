package by.course.task2.validator;

import by.course.task2.reader.FieldsReader;
import by.course.task2.entity.PositionType;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constant.RegularExpressions.*;

public class Validator {


    public static boolean isValidEmployee(String temp) {

        String[] fieldsOfEmployee = temp.split(SPLIT_EXPRESSION);
        System.out.println(Arrays.toString(fieldsOfEmployee));

        Pattern positionPattern = Pattern.compile(POSITION_FIELD_EXPRESSION);
        Matcher positionMatcher = positionPattern.matcher(fieldsOfEmployee[0]);

        Pattern surnamePattern = Pattern.compile(SURNAME_FIELD_EXPRESSION);
        Matcher surnameMatcher = positionPattern.matcher(fieldsOfEmployee[1]);

        Pattern namePattern = Pattern.compile(POSITION_FIELD_EXPRESSION);
        Matcher nameMatcher = positionPattern.matcher(fieldsOfEmployee[2]);

        Pattern salaryPattern = Pattern.compile(POSITION_FIELD_EXPRESSION);
        Matcher salaryMatcher = positionPattern.matcher(fieldsOfEmployee[3]);

        Pattern rankPattern = Pattern.compile(POSITION_FIELD_EXPRESSION);
        Matcher rankMatcher = positionPattern.matcher(fieldsOfEmployee[4]);

        System.out.println(fieldsOfEmployee[6].equals(" "));

        System.out.println(positionMatcher.matches());
        return true;
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
        for (PositionType positionType : PositionType.values()) {
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
