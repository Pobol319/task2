package by.course.task2.main;

/*
Task

Необходимо написать объектно-ориентированное приложение согласно требованиям,
приведенным ниже. В приложении должна быть реализована функциональность, определенная индивидуальным заданием.


Требования
➢ При реализации иерархии наследования производный класс должен расширять суперкласс новыми свойствами,
для чего следует разобраться в предметной области задачи. При описании полей можно использовать класс Optional.
➢ Классы-сущности должны быть отделены от классов с методами бизнес-логики.
➢ Использовать перечисления (enum) для описания полей с ограниченным набором значений.
➢ Для сортировок наборов объектов можно использовать реализацию интерфейса Comparator и его возможности. В частности thenComparing.
➢ При решении задачи можно использовать паттерн Factory Method.
➢ Все классы приложения должны быть грамотно структурированы по пакетам.
➢ Оформление кода должно соответствовать Java Code Convention.
➢ Параметры, необходимые для создания объектов, должны вводиться с помощью чтения данных из файла (.txt).
Среди данных в файле должны быть заведомо некорректная информация. Должна присутствовать обработка некорректных данных инициализации объекта.
➢ Для записи логов использовать Log4J2.
➢ Код должен быть покрыт Unit-тестами.

№5
IT-фирма. Определить иерархию сотрудников. Создать несколько объектов.
Собрать команду разработчиков с определением ее стоимости (в человеко-часах).
Провести сортировку сотрудников на основе одного и нескольких параметров. Найти сотрудника,
соответствующего заданному диапазону зарплат.

*/

import by.course.task2.comparator.EmployeeNormalHoursComparator;
import by.course.task2.comparator.EmployeeSalaryComparator;
import by.course.task2.entity.Employee;
import by.course.task2.factory.EmployeeFactory;
import by.course.task2.reader.TxtReader;
import by.course.task2.actions.EmployeeActions;

import java.util.List;

import static by.course.task2.constants.EmployeeConstantsPool.*;

public class Main {
    private static final String ALL_EMPLOYEES_PATH = "resources\\employees.txt";
    private static final String DEVELOPER_TEAM_PATH = "resources\\developer_team.txt";

    public static void main(String[] args) {

        TxtReader txtReader = new TxtReader();
        List<String> listOfEmployeeTxt = txtReader.getEmployeesFromText(ALL_EMPLOYEES_PATH);
        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> listOfEmployees = employeeFactory.getListOfEmployee(listOfEmployeeTxt);

        /*Все сотрудники в компании*/
        System.out.println("Все сотрудники:");
        EmployeeActions.printEmployees(listOfEmployees);

        /*Сотрудникик в заданном диапазоне зарплат*/
        List<Employee> listOfEmployeesSalaryRange = EmployeeActions.getEmployeesFromSalaryRange(listOfEmployees, MIN_SALARY, MAX_SALARY);
        System.out.println("Сотрудники в диапазоне зарплат от " + MIN_SALARY + " до " + MAX_SALARY);
        EmployeeActions.printEmployees(listOfEmployeesSalaryRange);

        /*Создание команды разработчиков*/
        TxtReader developerFromFile = new TxtReader();
        List<String> listOfDevelopersTxt = developerFromFile.getEmployeesFromText(DEVELOPER_TEAM_PATH);
        List<Employee> listOfDevelopers = employeeFactory.getListOfEmployee(listOfDevelopersTxt);

        /*Команда разработчиков*/
        System.out.println("Команда разработчиков:");
        EmployeeActions.printEmployees(listOfDevelopers);
        System.out.println("Стоимость команды: " + EmployeeActions.sumOfNormalHours(listOfDevelopers) + " н/ч в USD");

        /* Сортировка команды разработчиков */
        EmployeeSalaryComparator compareSalary = new EmployeeSalaryComparator();
        EmployeeNormalHoursComparator compareNormalHours = new EmployeeNormalHoursComparator();
        System.out.println("Отсартированная команда разработчиков:");
        listOfDevelopers.sort(compareNormalHours.thenComparing(compareSalary));
        EmployeeActions.printEmployees(listOfDevelopers);
    }
}
