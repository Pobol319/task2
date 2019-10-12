package by.course.task2.entity;

public enum ScheduleType {
    FULL_TIME("Full-time"),
    HALF_TIME("Half-time");

    private final String schedule;

    ScheduleType(String schedule) {
        this.schedule = schedule;
    }
}
