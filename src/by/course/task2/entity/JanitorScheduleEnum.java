package by.course.task2.entity;

public enum JanitorScheduleEnum {
    FULL_TIME("Full-time"),
    HALF_TIME("Half-time");

    private String schedule;

    JanitorScheduleEnum(String schedule) {
        this.schedule = schedule;
    }

    public static JanitorScheduleEnum getJanitorScheduleEnum(String schedule) {
        if (JanitorScheduleEnum.FULL_TIME.schedule.equals(schedule)) {
            return JanitorScheduleEnum.FULL_TIME;
        } else if (JanitorScheduleEnum.HALF_TIME.schedule.equals(schedule)) {
            return JanitorScheduleEnum.HALF_TIME;
        }  else {
            return null;
        }
    }

}
