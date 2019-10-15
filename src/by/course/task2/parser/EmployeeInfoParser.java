package by.course.task2.parser;

import static by.course.task2.constants.RegularExpressions.SPLIT_EXPRESSION;

public class EmployeeInfoParser {
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

    public EmployeeInfoParser(String temp) {
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

    public String getEmployeePosition() { return position; }

    public String getEmployeeSurname() { return surname; }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeSalary() { return salary; }

    public String getITSpecialistRank() { return rank; }

    public String getITSpecialistNormalHours() {
        return normalHours;
    }

    public String getJanitorSchedule() {
        return schedule;
    }

    public String getBALevelOfEnglish() {
        return levelOfEnglish;
    }

    public String getDevLanguageOfDevelopment() { return languageOfDevelopment; }

    public String getTesterKnowledgeOfAutomation() { return knowledgeOfAutomation; }

}
