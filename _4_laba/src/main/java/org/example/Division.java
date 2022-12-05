package org.example;

/**
 * Класс Division хранит в себе информацию о подразделении человека
 */
public class Division {
    private int id;
    private String name;

    /**
     * Метод generatorId генерирует значение индекса для каждого подразделения, зависящего от значение поля name
     * @return id
     */
    private int generatorId() {
        return name.charAt(0)/2+10;
    }

    /**
     * Метод createIdByName заполняет значение поля id
     */
    public void createIdByName(){
        if(name==null) return;
        this.id=generatorId();
    }

    /**
     * Метод setName помещает значение в поле name
     * @param name
     */
    public void setName(String name){ this.name=name; }

    /**
     * Метод getId возвращает значение поля name
     * @return name
     */
    public String getName(){ return name; }

    /**
     * Метод getId возвращает значение поля id
     * @return id
     */
    public int getId(){ return id;}
}
