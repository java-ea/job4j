package ru.job4j.professions;

public class Programmer extends Engineer {
    private String program;

    public Programmer(String name, String surname, String birthday, String education, String plan, String program) {
        super(name, surname, birthday, education, plan);
    }

    public String writeProgram() {
        return program;
    }
}
