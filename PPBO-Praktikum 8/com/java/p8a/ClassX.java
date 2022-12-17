// Nama : Adeline Fellita Marwa
// NIM  : M0521002

package com.java.p8a;

import com.java.p8.Buku;

public class ClassX {
    public static void main(String[] args) {
        // buat objek buku
        Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

        // tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();

        // akses ke variabel yang ada di objek buku
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
    }
}

/*
Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
    Terdapat problem pada buku.printDataBuku() dan buku.penerbit karena method printDataBuku() dan variabel penerbit pada class Buku memiliki access modifier protected.
    Access modifier protected: hanya dapat diakses dari dalam class tersebut dan subclass dari class tersebut.

    Terdapat problem pada buku.isbn dan buku.tahunTerbit karena variabel isbn dan tahunTerbit pada class Buku memiliki access modifier default.
    Access modifier default: tidak bisa diakses di luar package.
        
    Terdapat problem pada buku.penulis karena variabel penulis pada class Buku memiliki access modifier private.
    Access modifier private: hanya dapat diakses dari dalam class tersebut.
 */