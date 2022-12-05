package org.example;

import java.math.BigDecimal;

/**
 * Класс Person хранит в себе информацию о человеке
 */
public class Person {
    private int id;
    private String name;
    private int salary;
    private Division division;
    private String gender;
    private String birthdayDay;

    /**
     * Метод setId помещает значение в поле id
     * @param id
     */
    public void setId(int id){ this.id=id; }

    /**
     * Метод setName помещает значение в поле name
     * @param name
     */
    public void setName(String name){ this.name=name; }

    /**
     * Метод setSalary помещает значение в поле salary
     * @param salary
     */
    public void setSalary(int salary){ this.salary=salary; }

    /**
     * Метод setGender помещает значение в поле gender
     * @param gender
     */
    public void setGender(String gender){ this.gender=gender; }

    /**
     * Метод setBirthdayDay помещает значение в поле birthdayDay
     * @param birthdayDay
     */
    public void setBirthdayDay(String birthdayDay){ this.birthdayDay=birthdayDay; }

    /**
     * Метод setDivision помещает значение в поле division, путем помещения в division его name и id
     * @param name
     */
    public void setDivision(String name) {
        this.division= new Division();
        this.division.setName(name);
        this.division.createIdByName();
    }

    /**
     * Метод getId возвращает значение поля id
     * @return значение поля id
     */
    public int getId(){ return id;}

    /**
     * Метод getName возвращает значение поля name
     * @return значение поля name
     */
    public String getName(){ return name;}

    /**
     * Метод getSalary возвращает значение поля salary
     * @return значение поля salary
     */
    public int getSalary(){ return salary;}

    /**
     * Метод getDivisionName возвращает значение поля name из класса Division
     * @return значение поля name из класса Division
     */
    public String getDivisionName(){ return division.getName();}

    /**
     * Метод getDivisionId возвращает значение поля id из класса Division
     * @return значение поля id из класса Division
     */
    public int getDivisionId(){ return division.getId(); }

    /**
     * Метод getGender возвращает значение поля gender
     * @return значение поля gender
     */
    public String getGender(){ return gender;}

    /**
     * Метод getSBirthdayDay возвращает значение поля birthdayDay
     * @return значение поля birthdayDay
     */
    public String getBirthdayDay(){ return birthdayDay;}

}
