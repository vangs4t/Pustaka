package com.gibson.util;


import java.util.Base64;

public class DataEncryption {

    private String eskripsi;

    public String getEskripsi() {
        return eskripsi;
    }

    public void setEskripsi(String eskripsi) {
        this.eskripsi = eskripsi;
    }

    /**
     * Membuat fitur untuk meng enskripsi input user
     * @param input
     * @return
     */
    public static String encryptionString(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }


    /**
     * Setelah membuat fitur untuk mengeskripsi kita juga harus membuat fitur untuk deskripsi
     * fiturnya itu menghapus kunci enskripsi yang tercampur dengan input user
     * tapi tanpa mengubah sedikitpun input user tersebut
     */

    public static String decryptionString(String input) {
        return new String(Base64.getDecoder().decode(input.getBytes()));
    }


}
