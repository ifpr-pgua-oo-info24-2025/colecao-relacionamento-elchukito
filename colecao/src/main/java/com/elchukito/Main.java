package com.elchukito;

import java.util.ArrayList;
import java.util.List;

import com.elchukito.models.*;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author("Gil Eduardo", "Brasil"));
        authorList.add(new Author("Queridao da Silva", "Georgia"));
        authorList.add(new Author("Guilherme Dias Borille", "USA"));
        authorList.add(new Author("Kayure Skylab", "Lituania"));

        PhysicalBook physicalBook1 = new PhysicalBook("Python para iniciantes", 2016, authorList.get(0), 124);
        PhysicalBook physicalBook2 = new PhysicalBook("Kamasutra", 2001, authorList.get(2), 269);
    
        Ebook ebook1 = new Ebook("13 Reasons why", 2010, authorList.get(1), 13.62);
        Ebook ebook2 = new Ebook("How to produce in fl", 2021, authorList.get(3), 45.32);

        library.add(physicalBook1);
        library.add(physicalBook2);
        library.add(ebook1);
        library.add(ebook2);

        library.get(0).viewDetails();
    }
}