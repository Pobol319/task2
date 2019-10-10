package by.course.task2.reader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.course.task2.constant.RegularExpressions.POSITION_EXPRESSION;

public class FieldsReader {
    String position;

    public String positionReader(String temp) {
        Pattern pattern = Pattern.compile(POSITION_EXPRESSION);
        Matcher matcher = pattern.matcher(temp);
        matcher.find();
        return matcher.group(1);
    }

}
