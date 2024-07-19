package com.gibson.system;

public interface ServiceUser {
    /**
     * Membuat method untuk pendaftaran user saat user mengclick daftar
     */
    void registerUser(String username, String password, String nama, String email);
    /**
     * membuat method untuk login dan menyesuaikan username dan password
     * yang ada di data user saat user mencoba login
     */
    void userLogin(String username, String password);

    /**
     * Jika user salah memasukan password selama 3x berturut2 maka
     * akan ada challenge jika user bukan bot atau robot
     */
//    String loginAttempt();

    /**
     * Jika user sudah selesai login maka akan diarahkan ke main menu
     * aplikasi perpustakaan
     */
//    void mainMenus();
}















