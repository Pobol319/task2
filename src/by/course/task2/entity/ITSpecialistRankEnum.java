package by.course.task2.entity;

public enum ITSpecialistRankEnum {
    JUNIOR("Junior"),
    MIDDLE("Middle"),
    SENIOR("Senior");

    private String rank;

    ITSpecialistRankEnum(String rank) {
        this.rank = rank;
    }

    public static ITSpecialistRankEnum getITSpecialistRankEnum(String rank) {
        if (ITSpecialistRankEnum.JUNIOR.rank.equals(rank)) {
            return ITSpecialistRankEnum.JUNIOR;
        } else if (ITSpecialistRankEnum.MIDDLE.rank.equals(rank)) {
            return ITSpecialistRankEnum.MIDDLE;
        } else if (ITSpecialistRankEnum.SENIOR.rank.equals(rank)) {
            return ITSpecialistRankEnum.SENIOR;
        } else {
            return null;
        }
    }

}
