package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void add() {
        ArrayList<Person> persons = new ArrayList<>();
        List<Person> emptyList = new ArrayList();
        assertThat(persons, is(emptyList));
        /**
         * PhoneDictionary phone = new PhoneDictionary();
         *         phone.add(
         *                 new Person("Petr", "Arsentev", "534872", "Bryansk")
         *         );
         *         List<Person> emptyList = new ArrayList();
         *         assertThat(phone, is(emptyList)); ???
         */
    }

    @Test
    public void find() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}