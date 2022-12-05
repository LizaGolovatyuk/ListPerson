package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Reader осуществляет считывание информации из файла и помещение информации о людях в список List
 */
public class Reader {
    private String file;
    List<Person> people;

    /**
     * Конструктор заполняющий поле people
     */
    public Reader(){
        people=new ArrayList<>();
    }

    /**
     * Метод read реализует считывание данных из файла и заполнение этими данными список людей
     */
    public void read(String file) {
        this.file=file;
        BufferedReader csvReader=null;
        String separator=";";
        String s="";
        try {
            csvReader = new BufferedReader(new FileReader(file));
            csvReader.readLine();
            while((s=csvReader.readLine())!=null) {
                String[] strPerson=s.split(separator);
                people.add(createPerson(strPerson));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Метод createPerson создает объект Person и заполняет его данными
     * @param strPerson
     * @return объект Person
     */
     public static Person createPerson(String[] strPerson){
        Person person = new Person();
        Division division = new Division();
        person.setId(Integer.parseInt(strPerson[0]));
        person.setName(strPerson[1]);
        person.setGender(strPerson[2]);
        person.setBirthdayDay(strPerson[3]);
        person.setDivision(strPerson[4]);
        person.setSalary(Integer.parseInt(strPerson[5]));
        return person;
    }

    /**
     * Метод getPeople вовращает значение поля people
     * @return people
     */
    public List<Person> getPeople(){
        return people;
    }
}
