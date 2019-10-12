package by.course.task2.parser;

import static by.course.task2.constants.RegularExpressions.SPLIT_EXPRESSION;

public class StringParser {
    private String position;
    private String surname;
    private String name;
    private String salary;
    private String rank;
    private String normalHours;
    private String schedule;
    private String levelOfEnglish;
    private String languageOfDevelopment;
    private String knowledgeOfAutomation;

    public StringParser(String temp) {
        String[] fieldsOfEmployee = temp.split(SPLIT_EXPRESSION);

        this.position = fieldsOfEmployee[0];
        this.surname = fieldsOfEmployee[1];
        this.name = fieldsOfEmployee[2];
        this.salary = fieldsOfEmployee[3];
        this.rank = fieldsOfEmployee[4];
        this.normalHours = fieldsOfEmployee[5];
        this.schedule = fieldsOfEmployee[6];
        this.levelOfEnglish = fieldsOfEmployee[7];
        this.languageOfDevelopment = fieldsOfEmployee[8];
        this.knowledgeOfAutomation = fieldsOfEmployee[9];
    }

    public String getPositionField() {
        return position;
    }

    public String getSurnameField() {
        return surname;
    }

    public String getNameField() {
        return name;
    }

    public String getSalaryField() {
        return salary;
    }

    public String getRankField() {
        return rank;
    }

    public String getNormalHoursField() {
        return normalHours;
    }

    public String getScheduleField() {
        return schedule;
    }

    public String getLevelOfEnglishField() {
        return levelOfEnglish;
    }

    public String getLanguageOfDevelopmentField() {
        return languageOfDevelopment;
    }

    public String getKnowledgeOfAutomationField() {
        return knowledgeOfAutomation;
    }

}
