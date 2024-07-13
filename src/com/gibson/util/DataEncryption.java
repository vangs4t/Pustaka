package com.gibson.util;


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
        String eskripsi = "@SVAxb!#43"; // kata kunci untuk mengensrkipsi input
        StringBuilder result = new StringBuilder(input);
        int eskripsiIndex = 0;

        for (int i = 1; i < result.length() && eskripsiIndex < eskripsi.length(); i += 3) { // 3 langkah setiap penambahan symbol dan kondisi agar index tidak melebihi kapasitas panjang ensripsi

                result.insert(i, eskripsi.charAt(eskripsiIndex)); // menambahkan enskripsi
                eskripsiIndex++; // tingkatkan index setiap enskripsi disisipkan

        }

        return result.reverse().toString(); // reverse agar bjorka susah masuk ke sistem
    }



    /**
     * Setelah membuat fitur untuk mengeskripsi kita juga harus membuat fitur untuk deskripsi
     * fiturnya itu menghapus kunci enskripsi yang tercampur dengan input user
     * tapi tanpa mengubah sedikitpun input user tersebut
     */

    public static String decryptionString(String input) {
        String eskripsi = "@SVAxb!#43"; // buat kunci enskripsi
        StringBuilder result = new StringBuilder(input);
        result.reverse(); // jangan lupa reverse

        for (char ch : eskripsi.toCharArray()) { // for each untuk mendapatkan masing2 symbol dari enskripsi
            int index;
            while ((index = result.indexOf(String.valueOf(ch))) != -1) { // buat kondisi untuk mencari index di dalam input
                result.deleteCharAt(index); // penghapusan index yang sesuai dengan enkripsi dan input aslinya tidak akan terhapus
            }
        }

        return result.toString();
    }


}
