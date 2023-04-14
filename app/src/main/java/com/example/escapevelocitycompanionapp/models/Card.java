package com.example.escapevelocitycompanionapp.models;

public class Card {
    public static final int GADGET_CARD = 0;
    public static final int PENALTY_CARD = 1;
    public static final int EVENT_CARD = 2;

    private String name;
    private int type;
    private String description;
    private String note;

    public Card(String name, int type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.note = "";
    }

    public Card(String name, int type, String description, String note) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
