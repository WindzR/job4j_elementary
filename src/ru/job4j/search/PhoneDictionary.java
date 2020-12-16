package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person value : persons) {
            if (persons.contains(key)) {
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary test = new PhoneDictionary();
        test.add(new Person("Dima", "Bodin", "123456", "Smol"));
        ArrayList<Person> persons = test.find("123456");
        for (Person value : persons) {
            System.out.println(value);
        }
    }
}
