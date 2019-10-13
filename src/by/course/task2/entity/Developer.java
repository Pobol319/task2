package by.course.task2.entity;

import by.course.task2.enums.DevLanguageEnum;
import by.course.task2.enums.EmployeePositionEnum;
import by.course.task2.enums.ITSpecialistRankEnum;

public class Developer extends InformationTechnologySpecialist {
    private EmployeePositionEnum employeePositionEnum = EmployeePositionEnum.DEV;
    private DevLanguageEnum languageOfDevelopment;

    public Developer() {
    }

    public Developer(ITSpecialistRankEnum rank, double normalHours, DevLanguageEnum languageOfDevelopment) {
        super(rank, normalHours);
        this.languageOfDevelopment = languageOfDevelopment;
    }

    public EmployeePositionEnum getEmployeePositionEnum() {
        return employeePositionEnum;
    }

    public DevLanguageEnum getLanguageOfDevelopment() {
        return languageOfDevelopment;
    }

    public void setLanguageOfDevelopment(DevLanguageEnum languageOfDevelopment) {
        this.languageOfDevelopment = languageOfDevelopment;
    }

    @Override
    public String toString() {
        return super.toString() + "Position: " + employeePositionEnum + ", Language of development: " + languageOfDevelopment;
    }
}
