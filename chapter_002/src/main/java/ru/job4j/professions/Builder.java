package ru.job4j.professions;

public class Builder extends Engineer {
    private String house;

    public Builder(String name, String surname, String birthday, String education, String plan, String house) {
        super(name, surname, birthday, education, plan);
    }

    public String getHouse() {
        return house;
    }
}
