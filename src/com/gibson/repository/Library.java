package com.gibson.repository;

import com.gibson.entity.Book;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> arrayList = new ArrayList<>(); // field ini berfungsi untuk menyimpan buku yang akan di tambahkan
    private Book book;

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

    public void addBook(String title, String author, String isbn, int tahunRilis){ // method untuk menambahkan buku
        arrayList.add(new Book(title, author, isbn, tahunRilis));
    }

    public void listBook(){  // method untuk menampilkan daftar buku yang sudah di tampilkan
        System.out.println("## Daftar Pustaka ##");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + ". " + arrayList.get(i)); // melakukan perulangan untuk menampilkan index di dalam arraylist
        }
    }

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
















