package ru.job4j.professions;

public class Doctor extends Profession {
    private String diagnose;

    public Doctor(String name, String surname, String birthday, String education, String diagnose) {
        super(name, surname, birthday, education);
    }

    public String getDiagnose(Patient patient) {
        return diagnose;
    }

}