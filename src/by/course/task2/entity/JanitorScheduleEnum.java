package by.course.task2.entity;

public enum JanitorScheduleEnum {
    FULL_TIME("Full_time"),
    HALF_TIME("Half_time");

    private String schedule;

    JanitorScheduleEnum(String schedule) {
        this.schedule = schedule;
    }

}
