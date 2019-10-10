package entity;

public enum RankType {
    JUNIOR("Junior"),
    MIDDLE("Middle"),
    SENIOR("Senior");

    public final String rank;

    RankType(String rank) {
        this.rank = rank;
    }
}
