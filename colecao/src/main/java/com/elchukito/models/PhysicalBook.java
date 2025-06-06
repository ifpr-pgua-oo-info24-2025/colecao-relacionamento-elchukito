package com.elchukito.models;

public class PhysicalBook extends Book {
    private int numPages;

    public PhysicalBook(String title, int publicationYear, Author author, int numPages) {
        super(title, publicationYear, author);
        this.numPages = numPages;
    } 

    public String viewDetails() {
        return "\nLivro Fisico - " + super.viewDetails() + ", Paginas: " + this.numPages;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
