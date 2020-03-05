package com.company;

public class User {

    String name;
    String surname;
    static int idCounter = 1;

    public void setNameSurname(String name, String surname, int idCounter) {
        this.name = name;
        this.surname = surname;
        this.idCounter = idCounter;
        idCounter ++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }


}
