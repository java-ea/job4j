package ru.job4j.professions;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String birthday, String education, String diagnose, String heal) {
        super(name, surname, birthday, education, diagnose);
    }

    public String getOperations(Patient patient) {
        return operation;
    }
}
