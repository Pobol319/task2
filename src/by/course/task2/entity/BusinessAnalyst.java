package by.course.task2.entity;

public class BusinessAnalyst extends InformationTechnologySpecialist {
    private EmployeePositionEnum employeePositionEnum = EmployeePositionEnum.BA;
    private BAEnglishLevelEnum levelOfEnglish;

    public BusinessAnalyst() {
    }

    public BusinessAnalyst(ITSpecialistRankEnum rank, double normalHours, BAEnglishLevelEnum levelOfEnglish) {
        super(rank, normalHours);
        this.levelOfEnglish = levelOfEnglish;
    }

    public BAEnglishLevelEnum getLevelOfEnglish() {
        return levelOfEnglish;
    }

    public EmployeePositionEnum getEmployeePositionEnum() {
        return employeePositionEnum;
    }

    public void setLevelOfEnglish(BAEnglishLevelEnum levelOfEnglish) {
        this.levelOfEnglish = levelOfEnglish;
    }

    public String toString() {
        return super.toString() + "Position: " + employeePositionEnum + ", Level of English: " + levelOfEnglish;
    }
}
