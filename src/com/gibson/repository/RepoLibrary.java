package com.gibson.repository;

import com.gibson.entity.Book;

import java.util.ArrayList;

public interface RepoLibrary {

    ArrayList <Book> BOOK_ARRAY_LIST();

    void addBook(String title, String author, String isbn, int rilis);

}
