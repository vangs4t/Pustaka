package com.gibson;

import com.gibson.entity.Admin;
import com.gibson.entity.User;
import com.gibson.repository.RepoLibraryImpl;
import com.gibson.system.ServiceUserImpl;
import com.gibson.system.SystemLibraryImpl;
import com.gibson.util.NotNullValidation;
import com.gibson.view.ViewLibrary;

public class Main
{
    public static void main(String[] args) {
        RepoLibraryImpl impl = new RepoLibraryImpl();
        SystemLibraryImpl library = new SystemLibraryImpl(impl);
        testUserRegister();

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
    public static void testAddBookViaRepository(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        SystemLibraryImpl impl = new SystemLibraryImpl(library);
        ViewLibrary view = new ViewLibrary(impl);
        impl.serviceAddBook("Kambing", "RiskaMananta", "1234567890", 2021);
        impl.serviceAddBook("Cahaya Ilahi", "Kholil", "2345678901", 2014);
        impl.serviceAddBook("Jaran Goyang", "Ki mpu", "3456789012", 2021);
        view.listBook();

    }
    public static void testRemoveBookViaRepository(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        SystemLibraryImpl impl = new SystemLibraryImpl(library);
        ViewLibrary view = new ViewLibrary(impl);
        impl.serviceAddBook("Kambing", "RiskaMananta", "1234567890", 2021);
        impl.serviceAddBook("Cahaya Ilahi", "Kholil", "2345678901", 2014);
        impl.serviceAddBook("MenanamPadi", "Azhar Kasim", "3456789012", 2021);
        impl.serviceRemoveBook(2);
        view.listBook();
    }
    public static void testSearchBookViaRepository(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        SystemLibraryImpl impl = new SystemLibraryImpl(library);
        ViewLibrary view = new ViewLibrary(impl);
        impl.serviceAddBook("Kambing", "RiskaMananta", "1234567890", 2021);
        impl.serviceAddBook("Cahaya Ilahi", "Kholil", "2345678901", 2014);
        impl.serviceAddBook("MenanamPadi", "Azhar Kasim", "3456789012", 2021);
        impl.searchByTitle("Cahaya Ilahi");
    }
    public static void testViewBooks(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        SystemLibraryImpl impl = new SystemLibraryImpl(library);
        ViewLibrary view = new ViewLibrary(impl);
        impl.serviceAddBook("Kambing", "RiskaMananta", "1234567890", 2021);
        impl.serviceAddBook("Cahaya Ilahi", "Kholil", "2345678901", 2014);
        impl.serviceAddBook("MenanamPadi", "Azhar Kasim", "3456789012", 2021);
        view.listBook();
    }

    public static void testUserRegister(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        ServiceUserImpl user = new ServiceUserImpl(library);

        user.registerUser("vangs4", "helloword1", "Naufal Abdul", "pancawarnanaufal@gmail.com");
        for (int i = 0; i < library.USER_ARRAY_LIST().size(); i++) {
            System.out.println(library.USER_ARRAY_LIST().get(i).getPassword());
        }

    }
    public static void testLoginAttempt(){
        RepoLibraryImpl library = new RepoLibraryImpl();
        ServiceUserImpl user = new ServiceUserImpl(library);

        user.registerUser("vangs4", "helloword1", "Naufal Abdul", "pancawarnanaufal@gmail.com");
        user.userLogin("vangs4", "helloword");
    }
}
