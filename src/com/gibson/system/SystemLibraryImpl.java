package com.gibson.system;

import com.gibson.entity.Book;
import com.gibson.error.NotNull;
import com.gibson.repository.RepoLibrary;
import com.gibson.util.DataEncryption;
import com.gibson.util.NotNullValidation;

import java.util.ArrayList;

public class SystemLibraryImpl implements SystemLibrary{
    RepoLibrary library;

    public SystemLibraryImpl(RepoLibrary library) {
        this.library = library;
    }

    public ArrayList<Book> getAll(){
        return library.BOOK_ARRAY_LIST();
    }

    /**
     * melakukan pencarian buku dengan mencocokan title yang di input user
     * dengan data buku yang ada di dalam arraylist
     * @param title
     * @return
     */
    @Override
    public void searchByTitle(String title){ // method untuk mencari buku sesuai dengan title yang ingin dicari

        for (int i = 0; i < getAll().size(); i++) { // melakukan perulangan agar mudah mencari indexnya

            if (title.equals(getAll().get(i).getTitle())){ // buat kondisi untuk mencocokan title buku dan title yang dicari

                System.out.println("Buku ditemukan");
                System.out.println(getAll().get(i)); // menampilakan buku yang dicari
                break;
            }
        }
    }

    /**
     * dan disini kita akan menambahakn kan fitur login
     * jika input user sama dengan data yang ada di dalam arraylist userData maka userLogin
     */
    @Override
    public void userLogin(String username, String password){
        for (int i = 0; i < library.USER_ARRAY_LIST().size(); i++) {
            if (username.equals(library.USER_ARRAY_LIST().get(i).getUserName()) && password.equals(DataEncryption.decryptionString(library.USER_ARRAY_LIST().get(i).getPassword()))){
                // ambil password yang ada di dalam data dan decrytpe terlebih dahulu lalu cocokan dengan password yang dimasukan user
                // membuat kondisi jika input username dan password sama maka kamu bisa login
                System.out.println("Selamat datang " + library.USER_ARRAY_LIST().get(i).getNama());
            }
        }
    }

    /**
     * Membuat method untuk mengecek kalau input user tidak boleh null
     */
    @Override
    public void notNullChecker() {
        try{
            NotNullValidation.nullExeption(); // mencoba memanggil validasi pengecekan inputan null
        } catch (NotNull exeption){
            System.out.println("Silahkan coba lagi " + exeption);
            getAll().remove(getAll().size() - 1); // Jika memang index yang ditambahkan terdapat null maka otomatis terhapus lagi
        }
    }

    /**
     * Membuat method untuk menambahkan buku via service implementation
     * dan membuat kondisi jika title atau author buku null maka tidak bisa di tambahkan ke dalam data library
     * @param title, author, isbn
     * @param rilis
     */
    public void serviceAddBook(String title, String author, String isbn, int rilis){
        if ((!title .equals(null) && !author.equals(null) || (!title.isBlank() && !author.isBlank()) || (!title.isEmpty() && !author.isEmpty()))){
            library.addBook(title, author, isbn, rilis);
        } else {
            notNullChecker();
        }
    }
    /**
     * Memanggil method untuk menghapus buku via service implementation
     */
    public Book serviceRemoveBook(Integer number){
        return library.removeBook(number);
    }
}



















