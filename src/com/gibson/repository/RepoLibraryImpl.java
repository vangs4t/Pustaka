package com.gibson.repository;

import com.gibson.entity.Book;
import com.gibson.entity.User;
import com.gibson.util.DataEncryption;

import java.util.ArrayList;

public class RepoLibraryImpl implements RepoLibrary{
    private Book book;

    private ArrayList<Book> data = new ArrayList<>();
    private ArrayList<User> userData = new ArrayList<>();

    /**
     * Mendapatakan semua Data buku di dalam arraylist
     * @return
     */
    @Override
    public ArrayList<Book> BOOK_ARRAY_LIST() {
        return data;
    }

    @Override
    public ArrayList<User> USER_ARRAY_LIST() {
        return userData;
    }

    /**
     * Menambahkan data2 buku ke dalam arraylist
     * @param title
     * Memasukan Title buku
     * @param author
     * Masukan Penulis buku
     * @param isbn
     * Masukan kode percetakan
     * @param rilis
     * Tahun rilis bukunya
     */
    @Override
    public void addBook(String title, String author, String isbn, int rilis) {
        data.add(new Book(title, author, isbn, rilis));
    }

    /**
     * Method untuk menghapus list buku
     * @param number
     * @return
     */
    public Book removeBook(Integer number){
        return data.remove(number - 1); // nomor yang dimasukan oleh user dikurangi 1 karena index array selalu dimulai dari 0
    }

    /**
     * Menambahkan data user ke dalam arraylist setelah user melakukan pendaftaran
     * @param name
     * @param email
     * @param username
     * @param password
     */
    @Override
    public void addUserData(String name, String email, String username, String password) { // meminta user memasukan data2
        userData.add(new User(username, DataEncryption.encryptionString(password),name,email));
        // Melakukan encrypt password user untuk keamanan
    }
}
