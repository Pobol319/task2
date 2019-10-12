package by.course.task2.enums;

public enum JanitorScheduleEnum {
    FULL_TIME("Full-time"),
    HALF_TIME("Half-time");

    private final String schedule;

    JanitorScheduleEnum(String schedule) {
        this.schedule = schedule;
    }
}
