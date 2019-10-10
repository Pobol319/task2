package by.course.task2.file_handler;

import by.course.task2.reader.FieldsReader;
import by.course.task2.validator.Validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesFromFile {

    private List<String> getTextFromFile(String path) {

        File file = new File(path);

        ArrayList<String> textFromFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                textFromFile.add(temp);
            }
        } catch (IOException e2) {
            System.out.println();
        }
        return textFromFile;
    }

    public List<String> getEmployeesFromText(String path) {
        List<String> textFromFile = getTextFromFile(path);

        List<String> listOfEmployees = new ArrayList<>();
        Validator validator = new Validator();

        for (String temp : textFromFile) {
            if (validator.isValidEmployee(temp)) {
                listOfEmployees.add(temp);
            }
        }
        return listOfEmployees;
    }

}
