package by.course.task2.comparator;

import by.course.task2.entity.Developer;
import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;

import java.util.Comparator;

public class EmployeeNormalHoursComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(((InformationTechnologySpecialist) o1).getNormalHours(), ((InformationTechnologySpecialist) o2).getNormalHours());
    }
}
