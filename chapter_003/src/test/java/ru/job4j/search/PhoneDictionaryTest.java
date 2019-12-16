package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pavlo", "Stefiniv", "534872", "Ivano-Frankivsk")
        );
        ArrayList<Person> persons = phones.find("Pavlo");
        assertThat(persons.get(0).getSurname(), is("Stefiniv"));
    }
}