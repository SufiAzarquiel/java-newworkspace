package com.github.sufiazarquiel.workspace.oop;

public class Paciente {
    // Attributes
    private String name;
    private String id;
    private String corporation;

    // Constructors
    public Paciente(String name, String id, String corporation) {
        this.name = name;
        this.id = id;
        this.corporation = corporation;
    }
    
    public Paciente(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    // Methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    @Override
    public String toString() {
        return "Paciente [name=" + name + ", id=" + id + ", corporation=" + corporation + "]\n";
    }
}
