package by.course.task2.enums;

public enum DevLanguageEnum {
    JAVA("Java"),
    JAVASCRIPT("Javascript"),
    PYTHON("Python");


    private String languageOfDevelopment;

    DevLanguageEnum(String languageOfDevelopment) {
        this.languageOfDevelopment = languageOfDevelopment;
    }

    public static DevLanguageEnum getDevLanguageEnum(String languageOfDevelopment) {
        if (DevLanguageEnum.JAVA.languageOfDevelopment.equals(languageOfDevelopment)) {
            return DevLanguageEnum.JAVA;
        } else if (DevLanguageEnum.JAVASCRIPT.languageOfDevelopment.equals(languageOfDevelopment)) {
            return DevLanguageEnum.JAVASCRIPT;
        } else if (DevLanguageEnum.PYTHON.languageOfDevelopment.equals(languageOfDevelopment)) {
            return DevLanguageEnum.PYTHON;
        } else {
            return null;
        }
    }

}
