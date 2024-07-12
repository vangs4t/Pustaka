package com.gibson.repository;

import com.gibson.entity.Book;

import java.util.ArrayList;

public class RepoLibraryImpl implements RepoLibrary{
    private Book book;

    private ArrayList<Book> data = new ArrayList<>();

    @Override
    public ArrayList<Book> BOOK_ARRAY_LIST() {
        return data;
    }

    @Override
    public void addBook(String title, String author, String isbn, int rilis) {
        data.add(new Book(title, author, isbn, rilis));
    }
}
