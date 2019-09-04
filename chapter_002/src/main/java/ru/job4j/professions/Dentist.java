package ru.job4j.professions;

public class Dentist extends Doctor {
    private String tooth;

    public Dentist(String name, String surname, String birthday, String education, String diagnose, String tooth) {
        super(name, surname, birthday, education, diagnose);
    }

    public String getTooth(Patient patient) {
        return tooth;
    }
}
