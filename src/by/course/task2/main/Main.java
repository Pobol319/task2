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


import by.course.task2.entity.BusinessAnalyst;
import by.course.task2.entity.Employee;
import by.course.task2.entity.InformationTechnologySpecialist;
import by.course.task2.enums.ITSpecialistRankEnum;
import by.course.task2.factory.EmployeeFactory;
import by.course.task2.extractor.EmployeesFromFile;
import by.course.task2.util.EmployeeUtil;

import java.util.List;

import static by.course.task2.constants.EmployeeConstantsPool.*;

public class Main {
    private static final String FILE_PATH = "resources\\employees.txt";

    public static void main(String[] args) {

        EmployeesFromFile employeesFromFile = new EmployeesFromFile();
        List<String> listOfEmployeeTxt = employeesFromFile.getEmployeesFromText(FILE_PATH);

        String rank = "JUNIOR";
        ITSpecialistRankEnum.valueOf(rank);

        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> listOfEmployees = employeeFactory.getListOfEmployee(listOfEmployeeTxt);

        /*Все сотрудники в компании*/
        System.out.println("Все сотрудники:");
        EmployeeUtil.printEmployees(listOfEmployees);

        /*Сотрудникик в заданном диапазоне зарплат*/
        List<Employee> listOfEmployeesSalaryRange = EmployeeUtil.salaryRange(listOfEmployees, MIN_SALARY, MAX_SALARY);
        System.out.println("Сотрудники в диапазоне зарплат");
        EmployeeUtil.printEmployees(listOfEmployeesSalaryRange);


    }
}
