package by.course.task2.entity;

import by.course.task2.enums.ITSpecialistRankEnum;

public abstract class InformationTechnologySpecialist extends Employee {
    private ITSpecialistRankEnum rank;
    private double normalHours;

    public InformationTechnologySpecialist() {
    }

    public InformationTechnologySpecialist(ITSpecialistRankEnum rank, double normalHours) {
        this.rank = rank;
        this.normalHours = normalHours;
    }

    public ITSpecialistRankEnum getRank() {
        return rank;
    }

    public double getNormalHours() {
        return normalHours;
    }

    public void setRank(ITSpecialistRankEnum rank) {
        this.rank = rank;
    }

    public void setNormalHours(double normalHours) {
        this.normalHours = normalHours;
    }

    public String toString() {
        return super.toString() + "Rank: " + rank + ", Normal Hours: " + normalHours + ", ";
    }
}
