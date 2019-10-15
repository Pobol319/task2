package by.course.task2.entity;

public class Tester extends InformationTechnologySpecialist {
    private EmployeePositionEnum employeePositionEnum = EmployeePositionEnum.TESTER;
    private TesterAutomationKnowledgeEnum knowledgeOfAutomation;

    public Tester() {
    }

    public Tester(ITSpecialistRankEnum rank, double normalHours, TesterAutomationKnowledgeEnum knowledgeOfAutomation) {
        super(rank, normalHours);
        this.knowledgeOfAutomation = knowledgeOfAutomation;
    }

    public TesterAutomationKnowledgeEnum getKnowledgeOfAutomation() {
        return knowledgeOfAutomation;
    }

    public void setKnowledgeOfAutomation(TesterAutomationKnowledgeEnum knowledgeOfAutomation) {
        this.knowledgeOfAutomation = knowledgeOfAutomation;
    }

    @Override
    public String toString() {
        return super.toString() + "Position: " + employeePositionEnum + ", Knowledge Of automation: " + knowledgeOfAutomation;
    }
}
