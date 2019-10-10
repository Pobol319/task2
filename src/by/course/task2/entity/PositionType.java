package by.course.task2.entity;

public enum PositionType {
    BA("BusinessAnalyst"),
    DEV("Developer"),
    TESTER("Tester"),
    JANITOR("Janitor");

    public final String position;

    PositionType(String position) {
        this.position = position;
    }

    public static boolean correctPosition(String position) {
        for (PositionType positionType : values()) {
            if (positionType.equals(position)) {
                return true;
            }
        }
        return false;
    }

}
