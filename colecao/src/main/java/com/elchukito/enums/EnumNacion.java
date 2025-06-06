package com.elchukito.enums;

public enum EnumNacion {
    BRASILEIRO(7,  "brasil"), AMERICANO(6, "united states"), 
    LITUANO(5, "lituana"), GEORGIANO(4, "georgia");

    EnumNacion(int id, String description) {
        this.id = 0;
        this.description = "EnumNacion";
    }

    private int id;
    private String description;

    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
}