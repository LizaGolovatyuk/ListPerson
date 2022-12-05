package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        List<Person> people = new ArrayList<>();
        reader.read("foreign_names.csv");
        people=reader.getPeople();
        for (Person i: people) {
            System.out.println(i.getId()+ " " +i.getName()+" "+i.getGender()+" "+i.getBirthdayDay()+" "+i.getDivisionName()+" "+i.getDivisionId()+" "+i.getSalary());
        }
    }
}