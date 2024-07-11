package com.gibson.entity;

public class Book {
    /**
     * Membuat Field yang merpresentasikan sebuah buku
     * yang berisi title, author, isbn, dan tahun rilisnya
     */
    String title;
    String author;
    String isbn;
    int rilis;


    public Book() {
    }

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn, int rilis) { // Construcktor untuk penambahan buku
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.rilis = rilis;
    }

    @Override
    public String toString() {  // method untuk menampikan buku
        return "Title : " + title +
                ", Author : " + author +
                ", ISBN  : "  + isbn +
                ", Rilis : " + rilis;
    }


    /**
     * Disini ada getter dan setter untuk memanggil dan mendapatkan bagian2 dari buku
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getRilis() {
        return rilis;
    }

    public void setRilis(int rilis) {
        this.rilis = rilis;
    }
}
