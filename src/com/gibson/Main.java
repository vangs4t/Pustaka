package com.gibson;

import com.gibson.repository.Library;

public class Main
{
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Wajah Baru", "Dandan Sunarya", "1234567890", 2023);
        library.addBook("Wajah lama", "Dandan Sutisna", "2345678901", 1983);
        library.searchByTitle("Wajah lama");
//        library.listBook();
    }
}
