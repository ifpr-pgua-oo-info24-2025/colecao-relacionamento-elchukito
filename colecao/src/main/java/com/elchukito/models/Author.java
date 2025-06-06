package com.elchukito.models;

import com.elchukito.enums.EnumNacion;

public class Author {
    private String name;
    private EnumNacion nacion;

    public Author(String name, EnumNacion nacion) {
        this.name = name;
        this.nacion = nacion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public EnumNacion getNacion() {
        return nacion;
    }
    public void setNacion(EnumNacion nacion) {
        this.nacion = nacion;
    }
}
