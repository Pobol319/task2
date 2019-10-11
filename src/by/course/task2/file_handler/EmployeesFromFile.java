package by.course.task2.file_handler;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static by.course.task2.validator.Validator.isValidEmployee;

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


        for (String temp : textFromFile) {
            if (isValidEmployee(temp)) {
                listOfEmployees.add(temp);
            }
        }
        return listOfEmployees;
    }

}
