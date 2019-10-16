package by.course.task2.exception;

public class EmployeeException extends Exception {
    private String text;

    public String getText() {
        return text;
    }

    public EmployeeException(String message, String fileName) {
        super(message);
        this.text = fileName;
    }

    public EmployeeException() {
        super();
    }

    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeException(Throwable cause) {
        super(cause);
    }
}
