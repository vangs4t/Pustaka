package com.gibson.util;

import com.gibson.anotation.IsBlankAnotation;
import com.gibson.entity.Book;
import com.gibson.error.IsBlank;
import com.gibson.error.NotNull;

import java.lang.reflect.Field;

public class NotNullValidation {

    public static Book buku = new Book();

    public static void nullExeption(){
        if (buku.getTitle() == null){
            throw new NotNull("Title buku tidak boleh kosong");
        } else if (buku.getAuthor() == null){
            throw new NotNull("Penulis buku tidak boleh kosong");
        }
    }

    /**
     * Melakukan pengecekan pada input user jika input nya blank atau kosong maka
     * proses program tidak bisa di lanjutkan
     * @param object
     */
    public static void generalFramework(Object object){
        Class aClass = object.getClass();
        Field[] fields = object.getClass().getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(IsBlankAnotation.class) != null){
                try{
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new IllegalArgumentException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException | IsBlank e){
                    System.out.println("Tidak bisa mengakses field" + field.getName());
                }
            }

        }
    }


}
