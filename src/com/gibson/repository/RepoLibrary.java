package com.gibson.repository;

import com.gibson.entity.Book;
import com.gibson.entity.User;

import java.util.ArrayList;

public interface RepoLibrary {

    ArrayList <Book> BOOK_ARRAY_LIST();

    ArrayList<User> USER_ARRAY_LIST();

    void addBook(String title, String author, String isbn, int rilis);

    Book removeBook(Integer integer);

    void addUserData (String name, String email, String username, String password);

}
