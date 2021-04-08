package com.ilkDenemeler;

public abstract class Person {
    private String name;
    private String surname;
    private String personalId; //TC no

    public Person(String name, String surname, String personalId) {
        this.name = name;
        this.surname = surname;
        this.personalId = personalId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }
}


