package entity;

public abstract class InformationTechnologySpecialists extends Employees {
    private String rank;
    private double normalHours;

    public String getRank() {
        return rank;
    }

    public double getNormalHours() {
        return normalHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setNormalHours(double normalHours) {
        this.normalHours = normalHours;
    }
}
