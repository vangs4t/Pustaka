package com.gibson.repository;

import com.gibson.entity.Book;
import com.gibson.error.NotNull;
import com.gibson.util.NotNullValidation;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> arrayList = new ArrayList<>(); // field ini berfungsi untuk menyimpan buku yang akan di tambahkan
    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    public Library() {
    }

    public Library(ArrayList<Book> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Book> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Book> arrayList) {
        this.arrayList = arrayList;
    }

    /**
     * Membuat method untuk mengecek kalau input user tidak boleh null
     */

    public void notNullChecker() {
        try{
            NotNullValidation.nullExeption(); // mencoba memanggil validasi pengecekan inputan null
        } catch (NotNull exeption){
            System.out.println("Silahkan coba lagi " + exeption);
            arrayList.remove(arrayList.size() - 2); // Jika memang index yang ditambahkan terdapat null maka otomatis terhapus lagi
        }
    }

    /**
     * method untuk menambahkan buku ke dalam perpustakaan dengan mengisi form yang sudah disediakan
     * @param title
     * @param author
     * @param isbn
     * @param tahunRilis
     */

    public void addBook(String title, String author, String isbn, int tahunRilis){ // method untuk menambahkan buku
        arrayList.add(new Book(title, author, isbn, tahunRilis));
    }

    /**
     * Method untuk menghapus list buku
     * @param number
     * @return
     */
    public Book removeBook(Integer number){
        return arrayList.remove(number - 1); // nomor yang dimasukan oleh user dikurangi 1 karena index array selalu dimulai dari 0
    }

    /**
     * Mehtod untuk menampilkan daftar buku yang sudah di tambahkan
     */

    public void listBook(){
        System.out.println("## Daftar Pustaka ##");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + ". " + arrayList.get(i)); // melakukan perulangan untuk menampilkan index di dalam arraylist
        }
    }

    /**
     * Mencari buku yang sudah di tambahkan sesuai dengan title buku tersebut
     * @param title
     */

    public void searchByTitle(String title){ // method untuk mencari buku sesuai dengan title yang ingin dicari

        for (int i = 0; i < arrayList.size(); i++) { // melakukan perulangan agar mudah mencari indexnya

            if (title.equals(arrayList.get(i).getTitle())){ // buat kondisi untuk mencocokan title buku dan title yang dicari

                System.out.println("Buku ditemukan");
                System.out.println(arrayList.get(i)); // menampilakan buku yang dicari
            } else {

                System.out.println("Buku tidak ditemukan");
            }
        }
    }

}
















