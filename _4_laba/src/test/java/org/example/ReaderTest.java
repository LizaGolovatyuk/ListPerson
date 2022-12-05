package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {
    Person personTest1, personTest2;
    String file="foreign_names_test.csv";

    @BeforeEach
    void setValue(){
        personTest1 = new Person();
        personTest1.setId(28298);
        personTest1.setName("Aarthi");
        personTest1.setGender("Female");
        personTest1.setBirthdayDay("24.09.1961");
        personTest1.setDivision("A");
        personTest1.setSalary(4300);

        personTest2 = new Person();
        personTest2.setId(28284);
        personTest2.setName("Aaleyah");
        personTest2.setGender("Female");
        personTest2.setBirthdayDay("04.02.1944");
        personTest2.setDivision("G");
        personTest2.setSalary(1000);
    }

    @Test
    void createPersonTest() {
        BufferedReader csvReader = null;
        String[] strPerson;
        try {
            csvReader = new BufferedReader(new FileReader(file));
            csvReader.readLine();
            String s = csvReader.readLine();
            strPerson = s.split(";");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals(personTest1.getId(), Reader.createPerson(strPerson).getId());
        assertEquals(personTest1.getName(), Reader.createPerson(strPerson).getName());
        assertEquals(personTest1.getBirthdayDay(), Reader.createPerson(strPerson).getBirthdayDay());
        assertEquals(personTest1.getDivisionName(), Reader.createPerson(strPerson).getDivisionName());
        assertEquals(personTest1.getSalary(), Reader.createPerson(strPerson).getSalary());
        assertEquals(personTest1.getGender(), Reader.createPerson(strPerson).getGender());
    }

    @Test
    void createPeopleTest(){
        List<Person> l=new ArrayList<>();
        l.add(personTest1);
        l.add(personTest2);
        Reader reader = new Reader();
        reader.read(file);
        assertEquals(l.get(1).getId(),reader.getPeople().get(1).getId());
        assertEquals(l.get(1).getName(),reader.getPeople().get(1).getName());
        assertEquals(l.get(1).getSalary(),reader.getPeople().get(1).getSalary());
        assertEquals(l.get(1).getBirthdayDay(),reader.getPeople().get(1).getBirthdayDay());
        assertEquals(l.get(1).getDivisionName(),reader.getPeople().get(1).getDivisionName());
        assertEquals(l.get(1).getGender(),reader.getPeople().get(1).getGender());
    }
}