package com.elchukito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.elchukito.enums.*;
import com.elchukito.models.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        ArrayList<Author> authorList = new ArrayList<>();
        authorList.add(new Author("Gil Eduardo", EnumNacion.BRASILEIRO));
        authorList.add(new Author("Queridao da Silva", EnumNacion.AMERICANO));
        authorList.add(new Author("Guilherme Dias Borille", EnumNacion.GEORGIANO));
        authorList.add(new Author("Kayure Skylab", EnumNacion.LITUANO));

        library.addAll(Arrays.asList(
            new PhysicalBook("Python para iniciantes", 2016, authorList.get(0), 124),
            new PhysicalBook("Kamasutra", 2001, authorList.get(2), 269),
            new Ebook("13 Reasons why", 2010, authorList.get(1), 1.3),
            new Ebook("How to produce in fl", 2021, authorList.get(3), 25.67)
        ));
        
        for (Book book : library) {
            System.out.println(book.viewDetails());
        }
    }
}
