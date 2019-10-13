package by.course.task2.entity;

import by.course.task2.enums.EmployeePositionEnum;
import by.course.task2.enums.JanitorScheduleEnum;

public class Janitor extends Employee {
    private EmployeePositionEnum employeePositionEnum = EmployeePositionEnum.JANITOR;
    private JanitorScheduleEnum schedule;

    public JanitorScheduleEnum getSchedule() {
        return schedule;
    }

    public void setSchedule(JanitorScheduleEnum schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        return super.toString() + "Position: " + employeePositionEnum + ", Schedule: " + schedule;
    }

}
