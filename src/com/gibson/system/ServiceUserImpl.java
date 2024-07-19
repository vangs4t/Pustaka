package com.gibson.system;

import com.gibson.repository.RepoLibraryImpl;
import com.gibson.util.DataEncryption;

public class ServiceUserImpl implements ServiceUser{
    RepoLibraryImpl library;

    public ServiceUserImpl(RepoLibraryImpl library) {
        this.library = library;
    }

    /**
     * Menambahkan kondisi jika password null maka user harus memasukan lagi password nya ulang
     * @param username
     * @param password
     * @param nama
     * @param email
     */
    @Override
    public void registerUser(String username, String password, String nama, String email) {
        boolean condition = true;
        while (condition){
            if (password != null){
                library.addUserData(nama,email,username,password);
                condition = false;
            } else {
                System.out.println("Silahkan masukan ulang data");
                condition = true;
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
            } else {
                System.out.println("Password atau username salah");
            }
        }
    }

}
