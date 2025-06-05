package com.elchukito.models;

public class Author {
    private String name;
    private String nacion;

    public Author(String name, String nacion) {
        this.name = name;
        this.nacion = nacion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNacion() {
        return nacion;
    }
    public void setNacion(String nacion) {
        this.nacion = nacion;
    }
}
