package by.course.task2.entity;

public abstract class Employee {
    private String name;
    private String surname;
    private double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() { return salary; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Surname: " + surname + ", Name: " + name + ", Salary: " + salary + ", ";
    }
}
