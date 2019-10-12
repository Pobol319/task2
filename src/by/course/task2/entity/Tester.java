package by.course.task2.entity;

import by.course.task2.enums.ITSpecialistRankEnum;
import by.course.task2.enums.TesterAutomationKnowledgeEnum;

public class Tester extends InformationTechnologySpecialist {
    private TesterAutomationKnowledgeEnum knowledgeOfAutomation;

    public Tester(){}

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
}
