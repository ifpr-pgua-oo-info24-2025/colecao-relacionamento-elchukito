package com.elchukito.models;

public class Ebook extends Book {
    private Double fileSizeMB;

    public Ebook(String title, int publicationYear, Author author, Double fileSizeMB) {
        super(title, publicationYear, author);
        this.fileSizeMB = fileSizeMB;
    }

    public String viewDetails() {
        return "\nLivro Digital - " + super.viewDetails() + ", Tamanho: " + this.fileSizeMB + "MB";
    }

    public Double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(Double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
