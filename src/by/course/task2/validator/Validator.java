package by.course.task2.validator;

import by.course.task2.reader.FieldsReader;
import entity.PositionType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constant.RegularExpressions.*;

public class Validator {
    FieldsReader fieldsReader = new FieldsReader();

    public boolean isValidEmployee(String temp) {
        if (isValidPosition(temp)) {
            String position = fieldsReader.positionReader(temp);
            if (position.equals("BusinessAnalyst")) {

            }

        }
        isValidPosition(temp);
        isValidRank(temp);
        return false;
    }

    private boolean isValidFieldsOfEmployee(String temp) {
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
    }


}
