package ru.job4j.professions;

public class Engineer extends Profession {
    private String plan;

    public Engineer(String name, String surname, String birthday, String education, String plan) {
        super(name, surname, birthday, education);
    }

    public String getPlan() {
        return plan;
    }
}
