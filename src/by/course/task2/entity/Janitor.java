package by.course.task2.entity;

import by.course.task2.enums.JanitorScheduleEnum;

public class Janitor extends Employee {
    private JanitorScheduleEnum schedule;

    public JanitorScheduleEnum getSchedule() {
        return schedule;
    }

    public void setSchedule(JanitorScheduleEnum schedule) {
        this.schedule = schedule;
    }

}
