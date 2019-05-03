package com.jetbrains;

public class Person {

    String name, surname;
    int age, id;

    // Constructor
    public Person(int id, int age, String name, String surname){
        this.age = age;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // Get age
    public int getAge() {
        return age;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get surname
    public String getSurname() {
        return surname;
    }

    // Get ID
    public int getId() {
        return id;
    }
}
