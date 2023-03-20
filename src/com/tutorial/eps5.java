// BELAJAR METHODS EPS 5

package com.tutorial;

class Mahasiswa {
    String nama = "nama kosong";
    String NIM = "NIM kosong";

    Mahasiswa(String nama, String NIM) {
        // long number;
        // number = (long) (Math.random() * 10);
        // System.out.println(number);
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void ubahNama(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan parameter
    String ubahTampilkan(String nama) {
        String asli = this.nama;
        this.nama = nama;
        return "nama telah diubah, dari " + asli + " menjadi " + nama;
    }
}

public class eps5 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", "0042924640");
        // System.out.println(mahasiswa1.ubahTampilkan("Andi Nawfal"));
        mahasiswa1.show();

        // System.out.println(mahasiswa1.getNama());
        // System.out.println(mahasiswa1.getNIM());
    }
}
