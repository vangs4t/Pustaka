package com.gibson.util;

import com.gibson.entity.Book;
import com.gibson.error.NotNull;

public class NotNullValidation {

    public static Book buku = new Book();

    public static void nullExeption(){
        if (buku.getTitle() == null){
            throw new NotNull("Title buku tidak boleh kosong");
        } else if (buku.getAuthor() == null){
            throw new NotNull("Penulis buku tidak boleh kosong");
        }
    }

}
