package com.gibson;

import com.gibson.entity.Admin;
import com.gibson.entity.User;
import com.gibson.repository.Library;
import com.gibson.repository.RepoLibraryImpl;
import com.gibson.system.SystemLibraryImpl;
import com.gibson.util.NotNullValidation;

public class Main
{
    public static void main(String[] args) {
        testValidationUserRequest();
    }

    /**
     * Melakukan pengetesan penambahan buku pada dataBook
     */
    public static void testAddBook(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        SystemLibraryImpl impl = new SystemLibraryImpl(library);
    }

    public static void testValidationUserRequest(){
        Admin admin = new User(null, "Kuningan1","Naufal","kanjutbadag@gmail.com");
        NotNullValidation.generalFramework(admin);
    }
}
