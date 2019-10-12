package by.course.task2.enums;

public enum EmployeePositionEnum {
    BA("BusinessAnalyst"),
    DEV("Developer"),
    TESTER("Tester"),
    JANITOR("Janitor");

    public final String position;

    EmployeePositionEnum(String position) {
        this.position = position;
    }

    public static boolean correctPosition(String position) {
        for (EmployeePositionEnum employeePositionEnum : values()) {
            if (employeePositionEnum.equals(position)) {
                return true;
            }
        }
        return false;
    }

}
