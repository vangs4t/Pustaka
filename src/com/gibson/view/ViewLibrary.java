package com.gibson.view;

import com.gibson.repository.Library;
import com.gibson.repository.RepoLibraryImpl;
import com.gibson.system.SystemLibrary;
import com.gibson.system.SystemLibraryImpl;

public class ViewLibrary {
    private RepoLibraryImpl library;
    private SystemLibraryImpl impl;

    public ViewLibrary(SystemLibraryImpl impl) {
        this.impl = impl;
    }

    public static void getAll(){
        System.out.println("### Daftar Buku ###");
    }

    public void listBook(){
        System.out.println("## Daftar Pustaka ##");
        for (int i = 0; i < impl.getAll().size(); i++) {
            System.out.println((i + 1) + ". " + impl.getAll().get(i)); // melakukan perulangan untuk menampilkan index di dalam arraylist
        }
    }
}
