package by.course.task2.enums;

public enum TesterAutomationKnowledgeEnum {
    YES("Yes"),
    NO("No");

    private String knowledgeOfAutomation;

    TesterAutomationKnowledgeEnum(String knowledgeOfAutomation) {
        this.knowledgeOfAutomation = knowledgeOfAutomation;
    }

    public static TesterAutomationKnowledgeEnum getTesterAutomationKnowledgeEnum(String knowledgeOfAutomation) {
        if (TesterAutomationKnowledgeEnum.NO.knowledgeOfAutomation.equals(knowledgeOfAutomation)) {
            return TesterAutomationKnowledgeEnum.NO;
        } else if (TesterAutomationKnowledgeEnum.YES.knowledgeOfAutomation.equals(knowledgeOfAutomation)) {
            return TesterAutomationKnowledgeEnum.YES;
        }  else {
            return null;
        }
    }
}
