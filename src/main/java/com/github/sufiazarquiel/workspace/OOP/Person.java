package com.github.sufiazarquiel.workspace.oop;

public class Person {

    // Attributes
    private String name;
    private String id;
    private String phoneNumber;

    // Constructors
    public Person(String name, String id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + "]";
    }
}
